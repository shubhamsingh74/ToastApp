package com.example.toastapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val callshubham = findViewById<Button>(R.id.shubham)
        val callsingh = findViewById<Button>(R.id.singh)
        val callbutton= findViewById<Button>(R.id.buttonshubham)

        callbutton.setOnClickListener{
            Toast.makeText(applicationContext,"Hello Button",Toast.LENGTH_SHORT).show()
            callbutton.setBackgroundColor(R.color.black)


        }



        callshubham.setOnClickListener {
//            Toast.makeText(applicationContext, "Hello Shubham...", Toast.LENGTH_LONG).show()
            intent = Intent(applicationContext, ExplicitActivity::class.java)
            startActivity(intent)
        }
        callsingh.setOnClickListener {
            Toast.makeText(applicationContext, "Hello Singh...", Toast.LENGTH_LONG).show()
        }

    }
}



