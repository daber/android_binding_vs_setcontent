package com.example.bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.bug.databinding.ActivitySameBinding

class BindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySameBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }
}