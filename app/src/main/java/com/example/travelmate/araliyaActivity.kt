package com.example.travelmate

import android.content.Intent
import android.media.CamcorderProfile.get
import android.nfc.tech.NfcA.get
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.appcompat.widget.ResourceManagerInternal.get
import androidx.lifecycle.ViewTreeLifecycleOwner.get
import java.lang.reflect.Array.get
import java.nio.file.Paths.get
import java.util.*
import java.util.Calendar


class araliyaActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_araliya)


        val dataPicker = findViewById<DatePicker>(R.id.datapicker)
        /*val today = get()
        dataPicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH))
        {
                view,year,month,day ->
            val month = month+1

            val checkindate = "$day/$month/$year"
            //Toast.makeText(this@araliyaActivity,checkindate,Toast.LENGTH_SHORT).show()
            var year = get(Calendar.YEAR)

        }
       */


    }
    /*fun addCalendar(view: View){
        val calendar :Calendar = Calendar.getInstance()
        val intent = Intent(Intent.ACTION_EDIT)
        intent.type = "vnd.android.cursor.item/event"
        intent.putExtra("beginTime",calendar.timeInMillis)
        intent.putExtra("allDay",true)
        intent.putExtra("rule","FREQ=YEARLY")
        intent.putExtra("endTime",calendar.timeInMillis + 60*60*1000)
        intent.putExtra("title","Calendar event")
        startActivity(intent)

    }*/
}

