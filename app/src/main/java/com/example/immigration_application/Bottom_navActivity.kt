package com.example.immigration_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import kotlinx.android.synthetic.main.activity_bottom_nav.*
import kotlinx.android.synthetic.main.app_bar_drawer.*

class Bottom_navActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.nav_host, Dashboard_Fragment())
        trans.commit()
        title = ""

        bottom_navigation.setOnNavigationItemSelectedListener {
            val trans = supportFragmentManager.beginTransaction()
            when (it.itemId) {
                R.id.enquiry_bottom -> {
                    title = "Enquiry"
                    trans.replace(R.id.nav_host, Enquiry_Fragment())
                    trans.addToBackStack(" ")
                    trans.commit()
                    Toast.makeText(this, "Enquiry", Toast.LENGTH_LONG).show()

                }
                R.id.dashboard_bottom -> {
                    title = "Dashboard"
                    trans.replace(R.id.nav_host, Dashboard_Fragment())
                    trans.addToBackStack("")
                    trans.commit()
                    Toast.makeText(this, "Dashboard", Toast.LENGTH_LONG).show()
                }
                R.id.cal_bottom -> {
                    title = "Calender"
                    trans.replace(R.id.nav_host, Fragment_calender())
                    trans.addToBackStack("")
                    trans.commit()
                    Toast.makeText(this, "Calender", Toast.LENGTH_LONG).show()
                }

            };false
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
