package com.jkdajacs.englishlearning.database.worddb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "newwords")
class NewWords(
    val englishWord: String,
    val translateWord: String
)

{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}