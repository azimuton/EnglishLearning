package com.jkdajacs.englishlearning.database.worddb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = arrayOf(Word::class, LearnedWords::class), version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao
    abstract fun copies(): Copies
    abstract fun learnedwordsDao(): LearnedWordsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        //val MIGRATION_1_2 = object : Migration(1, 2) {
        val MIGRATION_2_3 = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DROP TABLE IF EXISTS `profile`")
                database.execSQL("CREATE TABLE IF NOT EXISTS `profile`(englishWord)")
            }
        }
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "word_database")
                    .addMigrations( MIGRATION_2_3)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}