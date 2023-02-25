package com.example.toastapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val butto = findViewById<Button>(R.id.Button)
//        val kcall = findViewById<Button>(R.id.call)
//        val klinkedin = findViewById<Button>(R.id.linkedin)
//        val kgithub= findViewById<Button>(R.id.github)
//        val ktwitter = findViewById<Button>(R.id.twitter)
//
//
//        klinkedin.setOnClickListener{
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data= Uri.parse("https://www.linkedin.com/in/shubhamsingh2135/")
//            startActivity(intent)
//        }
//
//        kgithub.setOnClickListener{
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data= Uri.parse("https://github.com/shubhamsingh74")
//            startActivity(intent)
//        }
//
//        ktwitter.setOnClickListener{
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data= Uri.parse("https://twitter.com/devsinghshubham")
//            startActivity(intent)
//        }
//
//        kcall.setOnClickListener{
//            val intent=Intent(Intent.ACTION_CALL)
//            intent.data= Uri.parse("7027076155")
//            startActivity(intent)
//        }

        butto.setOnClickListener {
           Toast.makeText(applicationContext, "Hello Shubham...", Toast.LENGTH_LONG).show()
            intent = Intent(applicationContext, ExplicitActivity::class.java)
            startActivity(intent)
        }


    }
}



