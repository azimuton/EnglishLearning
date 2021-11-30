package com.jkdajac.englishlearning.database.worddb

import androidx.room.*

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM LearnedWords")
    fun getAllLearnedWords(): List<LearnedWords>

    @Insert
    fun insertLearnedWords(learnedWords: LearnedWords)

    @Delete
    fun deleteLearnedWords(learnedWords: LearnedWords)

    @Update
    fun updateLearnedWords(learnedWords: LearnedWords)

    @Query("SELECT * FROM LearnedWords WHERE id = :id")
    fun getLearnedWordsById(id: Int): LearnedWords?

}