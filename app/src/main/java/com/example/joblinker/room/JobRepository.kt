package com.example.joblinker.room

// JobRepository.kt
class JobRepository(private val jobDao: JobDao) {

    suspend fun insert(job: Job) {
        jobDao.insert(job)
    }

    suspend fun getAllJobs(): List<Job> {
        return jobDao.getAllJobs()
    }
}
