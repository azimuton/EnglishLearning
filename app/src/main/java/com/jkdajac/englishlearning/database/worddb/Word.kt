package com.jkdajac.englishlearning.database.worddb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word")
class Word(
    val englishWord: String,
    val translateWord: String
        )

{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

@Entity(tableName = "learnedwords")
class LearnedWords(
    val englishWord: String,
    val translateWord: String
)

{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}





