package com.example.travelmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.*

class araliyaActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_araliya)

        val dataPicker = findViewById<DatePicker>(R.id.datapicker)
        val today = Calendar.getInstance()
        dataPicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH))
        {
                view,year,month,day ->
            val month = month+1
            val msg  = "You selected :$day/$month/$year"
            Toast.makeText(this@araliyaActivity,msg,Toast.LENGTH_SHORT).show()
        }
    }
}

