package com.vn.ntesco.fragment


import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.google.android.gms.tasks.OnFailureListener
import com.google.firebase.firestore.*
import com.vn.ntesco.MainApplication

import com.vn.ntesco.R
import com.vn.ntesco.activity.MainActivity
import com.vn.ntesco.adapter.MessageChatAdapter
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.model.MessageChat
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.utils.WriteLog
import android.os.Build
import com.google.firebase.iid.FirebaseInstanceId
import com.vn.ntesco.model.Request.MessageRequest
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.io.IOException


class ChatBotFragment : BaseFragment(), View.OnClickListener {
    lateinit var db: FirebaseFirestore
    lateinit var edtSendMessage: EditText
    lateinit var ivSend: ImageView
    lateinit var messageList: MutableList<MessageChat>
    lateinit var messageChatAdapter: MessageChatAdapter
    lateinit var rvMessage: androidx.recyclerview.widget.RecyclerView
    lateinit var chatRef: CollectionReference
    lateinit var listener: ListenerRegistration
    var userId: String = ""
        get() {
            if (UserCache.isLogin())
                return UserCache.userInfo?.id.toString()
            else
                return Utils.getDeviceId(context)
        }
    var senderName: String = ""
        get() {
            if (UserCache.isLogin())
                return UserCache.userInfo?.username!!
            else
                return Utils.getDeviceId(context)
        }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        db = FirebaseFirestore.getInstance()
        chatRef = db.collection(Constant.CHAT).document(userId).collection(userId)
        messageList = ArrayList<MessageChat>()
        messageChatAdapter = MessageChatAdapter(activity!!)
        edtSendMessage = view.findViewById(R.id.edtSendMessage)
        ivSend = view.findViewById(R.id.ivSend)
        rvMessage = view.findViewById(R.id.rvChatBot)
        rvMessage.apply {
            adapter = messageChatAdapter
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
            messageChatAdapter.setData(messageList)
        }
        ivSend.setOnClickListener(this)
        realtimeUpdateListener()
        registerBroadcast(loginBroadcastReceiver, Constant.LOGIN_LOCAL_BROADCAST)
        rvMessage.addOnLayoutChangeListener(View.OnLayoutChangeListener { v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->
            if (messageChatAdapter.itemCount > 0) {
                if (bottom < oldBottom) {
                    rvMessage.post { rvMessage.smoothScrollToPosition(messageChatAdapter.itemCount - 1) }
                }
            }

        })

    }

    override fun getLayoutResource(): Int {
        return R.layout.fragment_chat_bot
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ivSend -> {
                if (!edtSendMessage.text.toString().trim().isEmpty())
                    sendMessage()
            }

        }
    }

    fun sendMessage() {
        if (Constant.isLoggedOut) {
            Constant.isLoggedOut = false
            showAlertCallback(getString(R.string.user_is_log_in_other_divice), object : DialogUtils.CallbackDialog {
                override fun onCancel() {

                }

                override fun onAccept() {
                    UserCache.saveUserInfo(null)
                    val intent = Intent(activity, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                    sendBroadcast()
                }
            })
            return
        }
        val message = MessageChat(edtSendMessage.text.toString(), FieldValue.serverTimestamp(), userId, senderName)
        db.collection(Constant.CHAT).document(userId).set(message)
        chatRef.add(message).addOnSuccessListener {
        }.addOnFailureListener(OnFailureListener {
            WriteLog.e("error", it.toString())
        })
        sendMessageApi()
        edtSendMessage.text = null
    }

    private fun realtimeUpdateListener() {
        listener = chatRef.orderBy("created").addSnapshotListener { snapshot, e ->
            //  messageList = snapshot!!.toObjects(MessageChat::class.java)
            //val messageList = ArrayList<MessageChat>()
            if (snapshot?.isEmpty!!) {
                val message = MessageChat("Hi! Can i help you", FieldValue.serverTimestamp(), "999", senderName)
                message.type = MessageChatAdapter.RECIPIENT
                messageList.add(message)
                messageList.add(MessageChat("I have a question", FieldValue.serverTimestamp(), userId, senderName))
                messageChatAdapter.notifyDataSetChanged()
            } else {
                for (snap in snapshot!!.documentChanges) {
                    when (snap.type) {
                        DocumentChange.Type.ADDED -> {
                            val message = snap.document.toObject(MessageChat::class.java)
                            if (!message?.senderId!!.equals(userId)) {
                                message.type = MessageChatAdapter.RECIPIENT
                            }
                            messageList.add(message)
                            messageChatAdapter.notifyItemInserted(messageList.size - 1)
                            rvMessage.smoothScrollToPosition(messageList.size - 1)
                        }

                    }

                }
            }

        }

    }

    private fun sendMessageApi() {
        val messageRequest = MessageRequest(edtSendMessage.text.toString(), userId, senderName)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .sendMessage(messageRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NTescoResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(nTescoResponse: NTescoResponse) {
                        if (nTescoResponse.code == Constant.SUCCESS) {

                        }

                    }

                })
    }

    override fun onDestroy() {
        super.onDestroy()
        listener.remove()
        unregisterBroadcast(loginBroadcastReceiver)
    }


    internal var loginBroadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            //     val isLogout = intent.getBooleanExtra(Constant.LOG_OUT, false)
            listener.remove()
            messageChatAdapter.messageList.clear()
            messageChatAdapter.notifyDataSetChanged()
            chatRef = db.collection(Constant.CHAT).document(userId).collection(userId)
            realtimeUpdateListener()

        }
    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.LOGIN_LOCAL_BROADCAST)
        intent.putExtra(Constant.LOG_OUT, true)
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(MainApplication.context).sendBroadcast(intent)
    }
}
