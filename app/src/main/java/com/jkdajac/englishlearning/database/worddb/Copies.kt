package com.jkdajac.englishlearning.database.worddb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Transaction

@Dao
abstract class Copies {

    @Insert
    abstract  fun insert(learnedWords: LearnedWords)

    @Delete
    abstract  fun delete(word: Word)

    @Transaction
    open fun replace(word: Word, learnedwords: LearnedWords){
        delete(word)
        insert(learnedwords)
    }
}