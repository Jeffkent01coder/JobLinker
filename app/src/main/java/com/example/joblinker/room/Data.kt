package com.example.joblinker.room

// Job.kt
data class Job(
    val id: Long,
    val title: String,
    val location: String,
    val pay: String,
    val nature: String,
    // Add other necessary information fields
)
