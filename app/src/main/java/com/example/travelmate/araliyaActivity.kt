package com.example.travelmate

import android.annotation.SuppressLint
import android.content.Intent
import android.media.CamcorderProfile.get
import android.nfc.tech.NfcA.get
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.appcompat.widget.ResourceManagerInternal.get
import androidx.lifecycle.ViewTreeLifecycleOwner.get
import java.lang.reflect.Array.get
import java.nio.file.Paths.get
import java.util.*
import java.util.Calendar
import android.widget.AutoCompleteTextView
import android.widget.ArrayAdapter


class araliyaActivity : AppCompatActivity() {



    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_araliya)

        val book = findViewById<Button>(R.id.book)
        //get reference to the string array that we just created
        //val adults = resources.getStringArray(R.array.Adults)
        //create an array adapter  and pass the required parameter
        //in our case pass the context, drop down layout, and array
        //val arrayAdapter = findViewById<ArrayAdapter>(R.layout.dropdown_item)
        //get reference to the autocomplete text view
        //val autoCompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        //set adapter to the autocomplete tv to the adapter
        //autoCompleteTV.setAdapter(arrayAdapter)

        //val dataPicker = findViewById<DatePicker>(R.id.datapicker)
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
        book.setOnClickListener(){
            val intent = Intent(this,paymentActivity::class.java)
            startActivity(intent)
        }
    }
}

