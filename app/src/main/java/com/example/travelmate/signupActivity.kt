package com.example.travelmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Pattern

class signupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val username = findViewById<TextView>(R.id.reusername)
        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<TextView>(R.id.repassword)
        val cpassword = findViewById<TextView>(R.id.cpassword)
        val resignup = findViewById<Button>(R.id.resignup)
        val cancel = findViewById<Button>(R.id.cancel)


        resignup.setOnClickListener()
        {
            fun isValidString(str: String):Boolean
            {
                return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
            }
            val emails = arrayOf<String>("hello@gmail.com", "one.com")
            emails.forEach()
            {
                Log.d("LoginActivity","is valid e-mail $it => ${isValidString(it)}")
            }
            if(username.text.isNullOrEmpty() || password.text.isNullOrEmpty())
            {
                val toast = Toast.makeText(applicationContext,"Please enter username and password", Toast.LENGTH_LONG).show()
            }
            else if(password.text.length != 8)
            {
                val toast = Toast.makeText(applicationContext,"Enter valid password", Toast.LENGTH_LONG).show()
            }
            /*else if(password != cpassword)
            {
                val toast = Toast.makeText(applicationContext,"Check password & confirm password fields",Toast.LENGTH_LONG).show()
            }*/
            else
            {
                val intent = Intent(this,galleryActivity::class.java)
                startActivity(intent)
            }
        }
        cancel.setOnClickListener(){
            //clearing data
            username.setText("")
            email.setText("")
            password.setText("")
            cpassword.setText("")

        }
    }
}