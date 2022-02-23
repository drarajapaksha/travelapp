package com.example.travelmate

import android.app.SearchManager
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.SearchView
import com.example.travelmate.databinding.ActivityMainBinding
import android.view.LayoutInflater


class galleryActivity : AppCompatActivity() {

    //lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)


        val imageView2 :ImageView = findViewById(R.id.imageView2)
        val imageView3 : ImageView = findViewById(R.id.imageView3)
        //val search = findViewById<Button>(R.id.search)
        val places = findViewById<Button>(R.id.places)
        val hotel : Button = findViewById(R.id.hotel)

        imageView2.setOnClickListener()
        {
            val intent = Intent(this,ruwanwaliActivity::class.java)
            startActivity(intent)
        }
        imageView3.setOnClickListener()
        {
            val intent = Intent(this, sigiriyaActivity::class.java)
            startActivity(intent)
        }

        places.setOnClickListener()
        {
            val intent = Intent(this,galleryActivity::class.java)
            startActivity(intent)
        }
        hotel.setOnClickListener()
        {
            val intent = Intent(this,hotelsActivity::class.java)
            startActivity(intent)
        }
    }


}