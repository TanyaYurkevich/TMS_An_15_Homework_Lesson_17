package com.example.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val button = findViewById<Button>(R.id.button_splash)
        button.setOnClickListener{
            startActivity(Intent(this, Onboarding1Activity::class.java))
        }
    }
}

