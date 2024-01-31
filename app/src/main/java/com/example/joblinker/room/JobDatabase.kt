package com.example.joblinker.room

// JobDatabase.kt
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Job::class], version = 1)
abstract class JobDatabase : RoomDatabase() {
    abstract fun jobDao(): JobDao

    companion object {
        private var INSTANCE: JobDatabase? = null

        fun getInstance(context: Context): JobDatabase {
            if (INSTANCE == null) {
                synchronized(JobDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        JobDatabase::class.java,
                        "job_database"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }
}
