package com.example.joblinker.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.joblinker.R
import com.example.joblinker.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}