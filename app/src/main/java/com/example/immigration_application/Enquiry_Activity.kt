package com.example.immigration_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.get
import kotlinx.android.synthetic.main.enquiry__fragment.*

class Enquiry_Activity : AppCompatActivity() {
    lateinit var option: Spinner
    lateinit var Intake: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enquiry__fragment)


        option = findViewById(R.id.spinner) as Spinner
        Intake =findViewById(R.id.intake)as TextView

        val Intake= arrayOf("December", "April", "Janauary")
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,Intake)

        spinner.adapter= arrayAdapter

        spinner.onItemSelectedListener= object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                intake.text="Select Month"
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                intake.text= option.get(position).toString()
            }
        }
    }
}
