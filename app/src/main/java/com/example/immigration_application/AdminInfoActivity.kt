package com.example.immigration_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.admin__fragment.*
import kotlinx.android.synthetic.main.enquiry__fragment.*

class AdminInfoActivity : AppCompatActivity() {
    lateinit var option: Spinner
    lateinit var city: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin__fragment)

        option= findViewById(R.id.spinner) as Spinner
        city=findViewById(R.id.city)as TextView

        val option= arrayOf("option1","option2","option3")
        val arrayAdapter=ArrayAdapter(this, android.R.layout.simple_spinner_item,option)

        spinner.adapter= arrayAdapter

        spinner.onItemSelectedListener  = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
               city.text="please Select a City"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                city.text= option.get(position)
            }
        }
    }

}
