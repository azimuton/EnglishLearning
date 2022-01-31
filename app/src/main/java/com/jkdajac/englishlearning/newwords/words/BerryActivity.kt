package com.jkdajac.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jkdajac.englishlearning.MainActivity
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.activity_berry.*
import kotlinx.android.synthetic.main.activity_fruits.*
import kotlinx.android.synthetic.main.activity_home_animals.*

class BerryActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berry)
        wordDatabase = AppDatabase.getDatabase(this)

        ivStrawberry.setOnClickListener {
            val english : String = strawberry.text.toString()
            val translate : String = tvStrawberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRaspberries.setOnClickListener {
            val english : String = raspberries.text.toString()
            val translate : String = tvRaspberries.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivStrawberries.setOnClickListener {
            val english : String = strawberries.text.toString()
            val translate : String = tvStrawberries.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCherries.setOnClickListener {
            val english : String = cherries.text.toString()
            val translate : String = tvCherries.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGooseberry.setOnClickListener {
            val english : String = gooseberry.text.toString()
            val translate : String = tvGooseberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCurrant.setOnClickListener {
            val english : String = currant.text.toString()
            val translate : String = tvCurrant.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCherry.setOnClickListener {
            val english : String = cherry.text.toString()
            val translate : String = tvCherry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGrape.setOnClickListener {
            val english : String = grape.text.toString()
            val translate : String = tvGrape.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivWatermelon.setOnClickListener {
            val english : String = watermelon.text.toString()
            val translate : String = tvWatermelon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMelon.setOnClickListener {
            val english : String = melon.text.toString()
            val translate : String = tvMelon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPumpkin.setOnClickListener {
            val english : String = pumpkin.text.toString()
            val translate : String = tvPumpkin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBlueberry.setOnClickListener {
            val english : String = blueberry.text.toString()
            val translate : String = tvBlueberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBlackberry.setOnClickListener {
            val english : String = blackberry.text.toString()
            val translate : String = tvBlackberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCranberry.setOnClickListener {
            val english : String = cranberry.text.toString()
            val translate : String = tvCranberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivDogwood.setOnClickListener {
            val english : String = dogwood.text.toString()
            val translate : String = tvDogwood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivLemongrass.setOnClickListener {
            val english : String = lemongrass.text.toString()
            val translate : String = tvLemongrass.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSeabuckthorn.setOnClickListener {
            val english : String = seabuckthorn.text.toString()
            val translate : String = tvSeabuckthorn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivOlives.setOnClickListener {
            val english : String = olives.text.toString()
            val translate : String = tvOlives.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRowan.setOnClickListener {
            val english : String = rowan.text.toString()
            val translate : String = tvRowan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivViburnum.setOnClickListener {
            val english : String = viburnum.text.toString()
            val translate : String = tvViburnum.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMulberry.setOnClickListener {
            val english : String = mulberry.text.toString()
            val translate : String = tvMulberry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBlueberrys.setOnClickListener {
            val english : String = blueberrys.text.toString()
            val translate : String = tvBlueberrys.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivYoshta.setOnClickListener {
            val english : String = yoshta.text.toString()
            val translate : String = tvYoshta.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}