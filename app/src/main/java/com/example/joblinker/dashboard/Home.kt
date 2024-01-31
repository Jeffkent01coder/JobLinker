package com.example.joblinker.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.joblinker.R
import com.example.joblinker.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}