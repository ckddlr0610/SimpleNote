package com.clean.simplenote.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.clean.simplenote.R
import com.clean.simplenote.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var viewDataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container_main_fragment, MenuFragment()).commit()

        with(viewDataBinding) {
            navMain.setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.nav_menu -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container_main_fragment, MenuFragment()).commit()
                    }
                    R.id.nav_search -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container_main_fragment, SearchFragment()).commit()
                    }
                    R.id.nav_edit -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container_main_fragment, EditFragment()).commit()
                    }
                    R.id.nav_add -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container_main_fragment, AddFragment()).commit()
                    }
                }
                false
            }
        }
    }
}