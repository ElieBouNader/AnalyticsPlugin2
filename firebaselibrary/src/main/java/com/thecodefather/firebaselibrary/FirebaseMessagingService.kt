package com.thecodefather.firebaselibrary

import android.os.Handler
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
/**
 *
 * Created by Hussein Yassine on 05, March, 2019.
 *
 */

class FirebaseMessagingService : FirebaseMessagingService() {

    val TAG = "Service"

    private fun sendToServer() {
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // messages, here is where that should be initiated.

        Log.wtf("Notification", TAG + " From: " + remoteMessage!!.from)

    }
}