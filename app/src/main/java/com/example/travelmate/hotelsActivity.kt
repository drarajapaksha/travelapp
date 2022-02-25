package com.example.travelmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class hotelsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotels)

        val imageView10 : ImageView = findViewById(R.id.imageView10)
        val place1 = findViewById<Button>(R.id.place1)
        val hotel1 = findViewById<Button>(R.id.hotel1)

        imageView10.setOnClickListener(){
            val intent = Intent(this,araliyaActivity::class.java)
            startActivity(intent)
        }
        place1.setOnClickListener(){
            val intent = Intent(this,galleryActivity::class.java)
            startActivity(intent)
        }
        hotel1.setOnClickListener(){
            val intent = Intent(this,hotelsActivity::class.java)
            startActivity(intent)
        }
    }
}