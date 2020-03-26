package com.example.immigration_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_calender_fragment.*

class Calendar_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_calender_fragment)

        val calendar = findViewById<CalendarView>(R.id.calendar_v)
        calendar_v?.setOnDateChangeListener { view, year, month, dayOfMonth ->
        val msg= "Selected Date is" + dayOfMonth   + "/" + (month+1) + year
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        }
    }
}



