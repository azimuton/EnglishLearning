package com.jkdajac.englishlearning.database.lernedwordsdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database(entities = arrayOf(LearnedWords::class), version = 1)
abstract class AppDatabaseLearned : RoomDatabase() {
    abstract fun learnedwordsDao(): LearnedWordsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabaseLearned? = null


        fun getDatabase(context: Context): AppDatabaseLearned {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabaseLearned::class.java,
                    "learnedwords_database")
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}