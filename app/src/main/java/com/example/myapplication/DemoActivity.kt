package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing.R

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        val intent : Intent = Intent(this@DemoActivity,com.acuant.sampleapp.MainActivity::class.java)
        startActivity(intent)
    }
}