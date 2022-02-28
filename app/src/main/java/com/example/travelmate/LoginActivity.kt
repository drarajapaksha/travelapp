package com.example.travelmate

import android.content.Intent
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val signup = findViewById<Button>(R.id.signup)

        login.setOnClickListener()
        {

            if(username.text.isNullOrEmpty() || password.text.isNullOrEmpty()){
                val toast = Toast.makeText(applicationContext,"Please enter username and password", Toast.LENGTH_LONG).show()
            }
            else if(password.text.length != 8)
            {
                val toast = Toast.makeText(applicationContext,"Not valid password", Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent = Intent(this,galleryActivity::class.java)
                startActivity(intent)
            }

        }

        signup.setOnClickListener()
        {
                val intent = Intent(this,signupActivity::class.java)
                startActivity(intent)
        }
    }
}