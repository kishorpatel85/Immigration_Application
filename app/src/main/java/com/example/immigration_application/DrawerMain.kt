package com.example.immigration_application

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_bottom_nav.*
import kotlinx.android.synthetic.main.activity_drawer_main.*
import kotlinx.android.synthetic.main.app_bar_drawer.*

class DrawerMain : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer_main)
        setSupportActionBar(toolbar)
        init()
    }
    @SuppressLint("WrongConstant")
    private fun init(){
        val toggle=ActionBarDrawerToggle(this, drawer_layout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        toggle.setToolbarNavigationClickListener { drawer_layout.openDrawer(Gravity.START) }
        toggle.syncState()
    }
}
