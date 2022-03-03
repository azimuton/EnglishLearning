package com.jkdajac.englishlearning.database.worddb

import androidx.room.*

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM LearnedWords")
    fun getAllLearnedWords(): List<LearnedWords>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedwords")
    fun count(): Int

    @Query("SELECT * FROM learnedwords ORDER BY RANDOM() LIMIT 1")
    fun randoms() : LearnedWords

    @Insert
    fun insertLearnedWords(learnedWords: LearnedWords)

    @Delete
    fun deleteLearnedWords(learnedWords: LearnedWords)

    @Update
    fun updateLearnedWords(learnedWords: LearnedWords)

    @Query("SELECT * FROM LearnedWords WHERE id = :id")
    fun getLearnedWordsById(id: Int): LearnedWords?


}