package com.jkdajac.englishlearning.database.lernedwordsdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learnedwords")
class LearnedWords(
    val englishWord: String,
    val translateWord: String
)

{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}