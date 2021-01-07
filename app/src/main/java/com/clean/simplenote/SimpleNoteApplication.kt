package com.clean.simplenote

import android.app.Application
import android.content.Intent
import com.clean.simplenote.view.MainActivity
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.Logger
import dagger.hilt.android.HiltAndroidApp
import kotlin.concurrent.timer

@HiltAndroidApp
class SimpleNoteApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })

        timer(period = 1000) {
            Intent(
                this@SimpleNoteApplication,
                MainActivity::class.java
            )
        }
    }

    override fun onLowMemory() {
        super.onLowMemory()

        // Add Code that show Dialog this device has low memory
    }

}