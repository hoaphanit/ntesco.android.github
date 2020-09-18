import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.net.ConnectivityManager
import android.net.Uri
import android.preference.PreferenceManager
import android.provider.Settings
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.core.content.ContextCompat

import com.vn.ntesco.R
import com.vn.ntesco.model.Category
import com.vn.ntesco.utils.ReportStatus
import com.vn.ntesco.utils.WriteLog
import okhttp3.MediaType
import okhttp3.RequestBody
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


object Utils {

    fun getListSolutionApplication(context: Context, categorysList: ArrayList<Category>): ArrayList<Category> {
        val categoryList: ArrayList<Category> = ArrayList()
        val categoryImg = intArrayOf(R.mipmap.aquaculture, R.mipmap.pharmaceutical, R.mipmap.residental, R.mipmap.industrial, R.mipmap.food_beverage, R.mipmap.desalination, R.mipmap.zld, R.mipmap.wastewater_treatment)
        val categoryColor = intArrayOf(R.color.blue, R.color.green, R.color.pink_rose, R.color.purple, R.color.bud_green, R.color.orange_crayola, R.color.purple_dark, R.color.pink_red)
        for ((index, value) in categorysList.withIndex()) {
            var category = Category(value.id, value.name, categoryImg[index], "", categoryColor[index])
            categoryList.add(category)
        }
        return categoryList
    }

    fun getListCategoryHome(context: Context?): ArrayList<Category> {
        val categoryList: ArrayList<Category> = ArrayList()
        val categoryImg = intArrayOf(R.mipmap.about_us, R.mipmap.service, R.mipmap.new_event, R.mipmap.solution_application, R.mipmap.chemical_calculation, R.mipmap.water_knowledge)
        val categoryColor = intArrayOf(R.color.dark_blue, R.color.blue, R.color.green, R.color.pink, R.color.orange_brown, R.color.purple_light)
        val cateName = context!!.resources.getStringArray(R.array.home_category)
        for ((index, value) in categoryImg.withIndex()) {
            var category = Category(index, cateName[index], categoryImg[index], "", categoryColor[index])
            categoryList.add(category)
        }
        return categoryList
    }

    fun toCalendar(date: Date): Calendar {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    }

    fun formatDateToDisplay(input: String): String? {
        val fromFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val toFormat = SimpleDateFormat("dd/MM/yyyy")
        var date: Date? = null
        try {
            date = fromFormat.parse(input)
            return toFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return null
    }

    fun getDay(input: String): String? {
        val fromFormat = SimpleDateFormat("yyyy-MM-dd")
        val toFormat = SimpleDateFormat("dd")
        var date: Date? = null
        try {
            date = fromFormat.parse(input)
            return toFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return null
    }

    fun formatDate(input: String): String {
        val fromFormat = SimpleDateFormat("yyyy-MM-dd")
        val toFormat = SimpleDateFormat("dd/MM/yyyy")
        var date: Date? = null
        try {
            date = fromFormat.parse(input)
            return toFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return ""
    }

    fun formatYear(input: String): String {
        val fromFormat = SimpleDateFormat("yyyy-MM-dd")
        val toFormat = SimpleDateFormat("yyyy")
        var date: Date? = null
        try {
            date = fromFormat.parse(input)
            return toFormat.format(date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return ""
    }

    fun geyHashKey(activity: Activity) {
        try {
            val info = activity.packageManager.getPackageInfo(
                    activity.packageName,
                    PackageManager.GET_SIGNATURES)
            for (signature in info.signatures) {
                val md = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                WriteLog.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            }
        } catch (e: PackageManager.NameNotFoundException) {

        } catch (e: NoSuchAlgorithmException) {

        }

    }

    fun getUserType(context: Context, type: Int): String {
        val arrStatus = context.resources.getStringArray(R.array.type_user)
        return arrStatus[type - 1]
    }

    fun getCalendarDate(date: String?): Calendar {
        val c = Calendar.getInstance()
        if (date == null || date.isEmpty()) {
            return c
        }
        val fromFormat = SimpleDateFormat("dd/MM/yyyy")
        try {
            val dateParse = fromFormat.parse(date)
            c.time = dateParse
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return c
    }
    fun getCalendar(date: String?): Calendar {
        val c = Calendar.getInstance()
        if (date == null || date.isEmpty()) {
            return c
        }
        val fromFormat = SimpleDateFormat("yyyy-MM-dd")
        try {
            val dateParse = fromFormat.parse(date)
            c.time = dateParse
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return c
    }
    fun getCurrentDate(): String {
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        return simpleDateFormat.format(Calendar.getInstance().time)
    }
    fun getStatusText(status: Int?, context: Context?): String? {
        when (status) {
            ReportStatus.CONFIRM.status -> {
                return context?.getString(R.string.confirmed)
            }
            ReportStatus.ASSIGNED.status -> {
                return context?.getString(R.string.assigned)
            }
            ReportStatus.PROCESSING.status -> {
                return context?.getString(R.string.processing_text)
            }
            ReportStatus.PROCESSING_STATUS.status -> {
                return context?.getString(R.string.processing_status_text)
            }
            ReportStatus.PROCESSED.status -> {
                return context?.getString(R.string.processed_text)
            }
            ReportStatus.COMPLETED.status -> {
                return context?.getString(R.string.completed)
            }
            ReportStatus.CANCEL.status -> {
                return context?.getString(R.string.canceled)
            }
            else ->
                return context?.getString(R.string.not_confirm)
        }
    }
    fun getStatusColor(status: Int?): Int {
        when (status) {
            ReportStatus.CANCEL.status -> {
                return R.color.grey_b9
            }
            ReportStatus.COMPLETED.status -> {
                return R.color.grey_b9
            }
            else ->
                 return R.color.blue_sky
        }
    }


    val KEY_REQUESTING_LOCATION_UPDATES = "requesting_locaction_updates"

    /**
     * Returns true if requesting location updates, otherwise returns false.
     *
     * @param context The [Context].
     */
    fun requestingLocationUpdates(context: Context): Boolean {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getBoolean(KEY_REQUESTING_LOCATION_UPDATES, false)
    }

    /**
     * Stores the location updates state in SharedPreferences.
     * @param requestingLocationUpdates The location updates state.
     */
    fun setRequestingLocationUpdates(context: Context, requestingLocationUpdates: Boolean) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putBoolean(KEY_REQUESTING_LOCATION_UPDATES, requestingLocationUpdates)
            .apply()
    }

    /**
     * Returns the `location` object as a human readable string.
     * @param location  The [Location].
     */
    fun getLocationText(location: Location?): String {
        return if (location == null)
            "Unknown location"
        else
            "(" + location!!.getLatitude() + ", " + location!!.getLongitude() + ")"
    }

    fun getLocationTitle(context: Context): String {
        return context.getString(
                R.string.location_updated,
                DateFormat.getDateTimeInstance().format(Date())
        )
    }

    fun hideKeyboard(activity: Activity) {
        val view = activity.getCurrentFocus()
        if (view != null) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
            imm!!.hideSoftInputFromWindow(view!!.getWindowToken(), 0)
        }

    }

    fun hideKeyboardView(view: View?) {
        if (view != null) {
            val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun isNetworkConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
    fun getDeviceId(context: Context?): String {
        return Settings.Secure.getString(context?.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    fun isReadStorageGranted(context: Context): Boolean {
        val storagePermissionGranted = ContextCompat.checkSelfPermission(context,
                Manifest.permission.READ_EXTERNAL_STORAGE)
        return storagePermissionGranted == PackageManager.PERMISSION_GRANTED
    }
     fun clearAllEditText(group: ViewGroup) {
        var i = 0
        val count = group.childCount
        while (i < count) {
            val view = group.getChildAt(i)
            if (view is EditText) {
                view.getText().clear();
            }
            if (view is ViewGroup && view.childCount > 0)
                clearAllEditText(view)
            ++i
        }
    }
    fun openChPlay(context: Context){
        val url = "https://play.google.com/store/apps/details?id=com.vn.ntesco&hl=vi"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
    fun toRequestBody(value: String?): RequestBody {
        return RequestBody.create(MediaType.parse("text/plain"), value)
    }
}