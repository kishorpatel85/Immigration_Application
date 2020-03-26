package com.example.immigration_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.dashboard__fragment.*

class Dashboard_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    card_admin.setOnClickListener {
        val intent=Intent(this,AdminInfoActivity::class.java)
        startActivity(intent) }

    card_agent.setOnClickListener {
        val intent= Intent(this,Agent_Fragment::class.java)
        startActivity(intent)}

    btn_application.setOnClickListener {
            val intent= Intent(this,Application_Fragment::class.java)
            startActivity(intent)}
    }
}
