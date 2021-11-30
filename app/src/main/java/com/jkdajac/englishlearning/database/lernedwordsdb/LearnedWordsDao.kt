package com.jkdajac.englishlearning.database.lernedwordsdb

import androidx.room.*


@Dao
interface LearnedWordsDao {
    @Query("SELECT * FROM learnedwords")
    fun getAll(): List<LearnedWords>

    @Query("SELECT * FROM LearnedWords WHERE englishWord LIKE :searchQuery ")
    fun searchDatabase(searchQuery : String): List<LearnedWords>?

    @Insert
    fun insertWord(learnedwords: LearnedWords)

    @Delete
    fun deleteWord(learnedwords: LearnedWords)

    @Update
    fun updateWord(learnedwords: LearnedWords)

    @Query("SELECT * FROM LearnedWords WHERE id = :id")
    fun getLearnedWordsById(id: Int): LearnedWords?
}