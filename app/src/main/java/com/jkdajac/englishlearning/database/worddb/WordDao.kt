package com.jkdajac.englishlearning.database.worddb

import androidx.room.*



@Dao
    interface WordDao {
        @Query("SELECT * FROM word")
        fun getAll(): List<Word>

        @Query("INSERT INTO learnedwords  SELECT * FROM word")
        fun copy()

        @Insert
        fun insertWord(word: Word)

        @Delete
        fun deleteWord(word : Word)

        @Update
        fun updateWord(word : Word)

        @Query("SELECT * FROM Word WHERE id = :id")
        fun getWordById(id: Int): Word?
    }
