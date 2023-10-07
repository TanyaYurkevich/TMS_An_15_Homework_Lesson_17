package com.example.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tms_an_15_homework_lesson_17.R.id.button4

class Onboarding4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)
        val button = findViewById<Button>(button4)
        button.setOnClickListener{
            startActivity(Intent(this, Registration::class.java))
        }
    }
}