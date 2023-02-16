package com.example.bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SetContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_same)
    }
}