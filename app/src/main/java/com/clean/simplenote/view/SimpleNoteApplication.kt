package com.clean.simplenote.view

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.Logger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SimpleNoteApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
        // initialize Hilt Application
    }

    override fun onLowMemory() {
        super.onLowMemory()

        // Add Code that show Dialog this device has low memory
    }

}