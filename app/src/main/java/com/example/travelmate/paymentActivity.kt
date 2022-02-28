package com.example.travelmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class paymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val fname = findViewById<TextView>(R.id.firstname)
        val lname = findViewById<TextView>(R.id.lastname)
        val address = findViewById<TextView>(R.id.address1)
        val email = findViewById<TextView>(R.id.emailaddress)
        val nic = findViewById<TextView>(R.id.nicno)
        val phno = findViewById<TextView>(R.id.phno)
        val cash = findViewById<RadioButton>(R.id.cash)
        val card = findViewById<RadioButton>(R.id.card)

        val paynow = findViewById<Button>(R.id.paynow)
        val cancel = findViewById<Button>(R.id.cancelpay)

        cancel.setOnClickListener(){
            //clearing data
            fname.setText("")
            lname.setText("")
            address.setText("")
            email.setText("")
            nic.setText("")
            phno.setText("")
            cash.setText("")
            cancel.setText("")
        }

    }
}
