package com.example.immigration_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.Menu
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hiding title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )

        setContentView(R.layout.activity_main)
        var topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        var bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

      /*  var image = findViewById(R.id.Image_View) as ImageView*/
        var logo = findViewById(R.id.forgot_password) as TextView

        /*image.animation(topAnim)
        logo.animation(bottomAnim)*/

        /*image.animation*/
        logo.animation


        var username = findViewById(R.id.edittext1) as EditText
        var pass = findViewById(R.id.edittext2) as EditText
        var btn = findViewById(R.id.btn_lgn) as Button



        fun onLoginSuccess() {
            btn_lgn!!.isEnabled = true

            startActivity(Intent(this, Bottom_navActivity::class.java))
        }

        fun onLoginFailed() {
            Toast.makeText(baseContext, "Login failed", Toast.LENGTH_LONG).show()
            btn_lgn.isEnabled = true
        }

        fun validate(): Boolean {
            var valid = true
            val email = edittext1!!.text.toString()
            val password = edittext2!!.text.toString()

            if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edittext1!!.error = "!!Please enter valid email address!!"
                valid = false }
            else {
                edittext1!!.error = null
            }

            if (password.isEmpty() || password.length < 4 || password.length > 10) {
                edittext2!!.error = "Password only between 4 and 10 alphanumeric characters allowed "
                valid = false}
            else {
                edittext2!!.error = null
            }

            return valid
        }
        fun login() {
            if (!validate())
                onLoginFailed()
            else {
                startActivity(Intent(this, DrawerMain::class.java))
                return }
            btn_lgn!!.isEnabled = true

        }
        btn_lgn!!.setOnClickListener {login()}

        val email = edittext1!!.text.toString()
        val password = edittext2!!.text.toString()

    }
}

