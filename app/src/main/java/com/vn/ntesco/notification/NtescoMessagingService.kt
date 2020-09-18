package com.vn.ntesco.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.vn.ntesco.R
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import java.util.*


public class NtescoMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        WriteLog.e("NtescoMessagingService: ", message.data.toString())
        sendNotification(message)
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        PrefUtils.getInstance().saveTokenFirebase(token)

    }

    public fun sendNotification(messageBody: RemoteMessage) {
        val type = if (messageBody.data["type"] != null) Integer.parseInt(messageBody.data["type"]!!) else 0
        if (type == 6) {
            Constant.isLoggedOut = true
            return
        }
        val title = messageBody.data["title"]
        val message = messageBody.data["body"]
        val idReport = if (messageBody.data["id_report"] != null) Integer.parseInt(messageBody.data["id_report"]!!) else 0
        val idNotify = if (messageBody.data["id"] != null) Integer.parseInt(messageBody.data["id"]!!) else 0
        val badge = if (messageBody.data["badge"] != null) Integer.parseInt(messageBody.data["badge"]!!) else 0
        val postId = if (messageBody.data["id_post"] != null) Integer.parseInt(messageBody.data["id_post"]!!) else 0

        val randomNumber = generateRandom()
        val intent = Intent(this, OpenNotifyReceiver::class.java)
        intent.putExtra(Constant.REPORT_ID, idReport)
        intent.putExtra(Constant.NOTIFICATION_ID, idNotify)
        intent.putExtra(Constant.TYPE_NOTIFY, type)
        intent.putExtra(Constant.POST_ID, postId)
        val pendingIntent = PendingIntent.getBroadcast(this, randomNumber /* Request code */, intent, PendingIntent.FLAG_ONE_SHOT)
        val channelId = getString(R.string.default_notification_channel_id)
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationBuilder = NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setNumber(badge)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Since android Oreo notification channel is needed.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "Channel human readable title", NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(channel)
        }
        notificationManager.notify(randomNumber /* ID of notification */, notificationBuilder.build())
        sendBroadcast()
    }

    fun generateRandom(): Int {
        val random = Random()
        return random.nextInt(9999 - 1000) + 1000
    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.NOTIFY_LOCAL_BROADCAST)
        intent.putExtra(Constant.FROM_NOTIFY, true)
       LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }
}