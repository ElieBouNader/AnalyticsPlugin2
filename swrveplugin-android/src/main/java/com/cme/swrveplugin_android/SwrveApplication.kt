package com.cme.swrveplugin_android

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.util.Log
import com.applicaster.app.CustomApplication
import com.swrve.sdk.SwrveInitMode
import com.swrve.sdk.SwrveNotificationConfig
import com.swrve.sdk.SwrveSDK
import com.swrve.sdk.config.SwrveConfig
import com.swrve.sdk.config.SwrveStack
import java.lang.IllegalArgumentException

class SwrveApplication: CustomApplication() {
    override fun onCreate() {
        super.onCreate()
        try {
            val config = SwrveConfig()
            config.initMode = SwrveInitMode.AUTO
            config.selectedStack = SwrveStack.EU
            config.setNotificationListener { pushJson ->
                Log.wtf("Received push", "of body: " + pushJson.toString(1))
            }
            SwrveSDK.createInstance(this, 6883,
                getString(R.string.debug_api_key), config)
        }catch (ex: IllegalArgumentException){
            Log.e("SwrveDemo", "Could not initialize the Swrve SDK", ex)
        }
    }
}