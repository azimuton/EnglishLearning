package com.jkdajac.englishlearning.database.worddb

import androidx.room.*



@Dao
    interface WordDao {
        @Query("SELECT * FROM word")
        fun getAll(): List<Word>

        @Query("INSERT INTO learnedwords IN learnedwords_database FROM word")
        fun copy(): List<Word>

        @Insert
        fun insertWord(word: Word)

        @Delete
        fun deleteWord(word : Word)

        @Update
        fun updateWord(word : Word)

        @Query("SELECT * FROM Word WHERE id = :id")
        fun getWordById(id: Int): Word?
    }
