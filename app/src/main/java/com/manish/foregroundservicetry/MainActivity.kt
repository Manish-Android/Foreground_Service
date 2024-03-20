package com.manish.foregroundservicetry

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var startService : Button
    lateinit var stopService : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        startService = findViewById(R.id.btn_start_service)
        stopService = findViewById(R.id.btn_stop_service)

        startService.setOnClickListener {
            val intent = Intent(this@MainActivity,MusicService :: class.java)
            startService(intent)
        }

        stopService.setOnClickListener {
            val intent = Intent(this@MainActivity,MusicService :: class.java)
            stopService(intent)

        }





    }
}