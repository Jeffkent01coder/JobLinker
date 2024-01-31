package com.example.joblinker.room

// JobDao.kt
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface JobDao {
    @Insert
    suspend fun insert(job: Job)

    @Query("SELECT * FROM job")
    suspend fun getAllJobs(): List<Job>
}
