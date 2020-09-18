package com.vn.ntesco.network

import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.gson.Gson
import com.vn.ntesco.MainApplication
import com.vn.ntesco.R
import com.vn.ntesco.activity.AccountActivity
import com.vn.ntesco.activity.MainActivity
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.utils.WriteLog
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.ResponseBody
import okio.Buffer
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

public class ServiceFactory private constructor() {
    //    var apiEndpoint = "https://courses.verztec-learn.com"
    companion object {
        val serviceFactory: ServiceFactory? = null
        var retrofit: Retrofit? = null
        var retrofitMultiPart: Retrofit? = null

        val instance: ServiceFactory
            get() {
                if (serviceFactory == null) return ServiceFactory()
                return serviceFactory
            }

        fun <T> createRetrofitService(clazz: Class<T>, endPoint: String): T {
            if (retrofit == null)
                retrofit = instance.getRetrofit(endPoint)

            return retrofit!!.create(clazz)
        }
        fun <T> createRetrofitMultiPartService(clazz: Class<T>, endPoint: String): T {
            if (retrofitMultiPart == null)
                retrofitMultiPart = instance.getRetrofit(endPoint,true)
            return retrofitMultiPart!!.create(clazz)
        }
    }


    private fun getHttpInterceptor(isMultiPart: Boolean = false): Interceptor {
        return Interceptor { chain ->
            if (!Utils.isNetworkConnected(MainApplication.context)) {
                showAlert(BaseActivity.baseActivity, BaseActivity.baseActivity?.getString(R.string.network_error), false)
            }
            var request = chain.request()
            val builder = request.newBuilder()
       //     builder.header("Accept", "application/json")
            if (isMultiPart)
                builder.addHeader("Content-Type", "multipart/form-data")
            else
                builder.addHeader("Content-Type", "application/json")
            builder.addHeader("Language", Constant.getLanguage())
            if (UserCache.isLogin())
                builder.addHeader("Authorization", "Bearer " + UserCache.userInfo?.accessToken.toString())
            request = builder.build()

            val t1 = System.nanoTime()
            WriteLog.e("Interceptor REQ", String.format("%s on %s%n%s", request.url(), chain.connection(), request.headers()))
            try {
                val copy = request.body()
                val buffer = Buffer()
                copy?.writeTo(buffer)
                WriteLog.e("BODY", buffer.readUtf8())
            } catch (e: IOException) {
                WriteLog.e("BODY ERROR", e.message.toString())
            }

            val response = chain.proceed(request)
            val t2 = System.nanoTime()
            val bodyString = response.body()!!.string()
            val ntescoResponse = Gson().fromJson(bodyString, NTescoResponse::class.java)

            synchronized(this) {
                if (ntescoResponse.code == 401) {
                    UserCache.saveUserInfo(null)
                    val nTescoResponse = Gson().fromJson<NTescoResponse>(bodyString, NTescoResponse::class.java!!)
                    showAlert(BaseActivity.baseActivity, nTescoResponse?.msg, true)

                } else {
                    if (ntescoResponse.code != Constant.SUCCESS) {
                        val nTescoResponse = Gson().fromJson<NTescoResponse>(bodyString, NTescoResponse::class.java!!)
                        showAlert(BaseActivity.baseActivity, nTescoResponse?.msg, false)

                    }
                }

            }

            //  WriteLog.e("Interceptor RESP:", String.format("%s in %.1fms%n%s body: %s", response.request().url(), (t2 - t1) / 1e6, response.headers(), bodyString))
            var requestLast = request.url().toString().split("/")[request.url().toString().split("/").size - 1];
            WriteLog.e("Interceptor RESP $requestLast:", bodyString)
            response.newBuilder()
                    .body(ResponseBody.create(response.body()!!.contentType(),
                            bodyString))
                    .build()
        }
    }

    fun getRetrofit(endPoint: String,isMultiPart: Boolean = false): Retrofit {
        val clientBuilder = OkHttpClient.Builder()
        clientBuilder.addInterceptor(getHttpInterceptor(isMultiPart))
        clientBuilder.connectTimeout(120, TimeUnit.SECONDS)
        clientBuilder.readTimeout(120, TimeUnit.SECONDS)
        clientBuilder.writeTimeout(120, TimeUnit.SECONDS)
        return Retrofit.Builder()
                .baseUrl(endPoint)
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
    }

    protected fun showAlert(activity: BaseActivity?, message: String?, isFinish: Boolean) {
        if (activity == null || message == null) return
        Handler(Looper.getMainLooper()).post {
            DialogUtils.showDialog(activity, message, object : DialogUtils.CallbackDialog {
                override fun onAccept() {
                    if (isFinish) {
                        val intent = Intent(MainApplication.context, MainActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        MainApplication.context.startActivity(intent)
                        sendBroadcast()
                    }

                }

                override fun onCancel() {

                }
            })
        }

    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.LOGIN_LOCAL_BROADCAST)
        intent.putExtra(Constant.LOG_OUT, true)
        LocalBroadcastManager.getInstance(MainApplication.context).sendBroadcast(intent)
    }
}