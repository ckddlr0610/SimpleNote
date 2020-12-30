package com.clean.simplenote.view

import android.app.Application

class SimpleNoteApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        // initialize Hilt Application
    }

    override fun onLowMemory() {
        super.onLowMemory()

        // Add Code that show Dialog this device has low memory
    }

}