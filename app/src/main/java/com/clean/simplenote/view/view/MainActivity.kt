package com.clean.simplenote.view.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.clean.simplenote.R
import com.clean.simplenote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewDataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        with(viewDataBinding) {
            navMain.setOnNavigationItemSelectedListener {
                false
            }
        }
    }
}