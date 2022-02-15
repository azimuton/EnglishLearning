package com.jkdajac.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.Word
import com.jkdajac.englishlearning.newwords.NewWordsActivity
import kotlinx.android.synthetic.main.activity_fruits.*
import kotlinx.android.synthetic.main.activity_vegetables.*
import kotlinx.android.synthetic.main.activity_vegetables.ivSquash

class FruitsActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_fruits)
        wordDatabase = AppDatabase.getDatabase(this)

        ivApple.setOnClickListener {
            val english : String = apple.text.toString()
            val translate : String = tvApple.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPear.setOnClickListener {
            val english : String = pear.text.toString()
            val translate : String = tvPear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPeach.setOnClickListener {
            val english : String = peach.text.toString()
            val translate : String = tvPeach.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPlum.setOnClickListener {
            val english : String = plum.text.toString()
            val translate : String = tvPlum.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivApricot.setOnClickListener {
            val english : String = apricot.text.toString()
            val translate : String = tvApricot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBanana.setOnClickListener {
            val english : String = banana.text.toString()
            val translate : String = tvBanana.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivOrange.setOnClickListener {
            val english : String = orange.text.toString()
            val translate : String = tvOrange.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMandarin.setOnClickListener {
            val english : String = mandarin.text.toString()
            val translate : String = tvMandarin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivLemon.setOnClickListener {
            val english : String = lemon.text.toString()
            val translate : String = tvLemon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMango.setOnClickListener {
            val english : String = mango.text.toString()
            val translate : String = tvMango.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivAvocado.setOnClickListener {
            val english : String = avocado.text.toString()
            val translate : String = tvAvocado.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPineapple.setOnClickListener {
            val english : String = pineapple.text.toString()
            val translate : String = tvPineapple.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGarnet.setOnClickListener {
            val english : String = garnet.text.toString()
            val translate : String = tvGarnet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivKiwi.setOnClickListener {
            val english : String = kiwi.text.toString()
            val translate : String = tvKiwi.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGrapefruit.setOnClickListener {
            val english : String = grapefruit.text.toString()
            val translate : String = tvGrapefruit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPomelo.setOnClickListener {
            val english : String = pomelo.text.toString()
            val translate : String = tvPomelo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivQuince.setOnClickListener {
            val english : String = quince.text.toString()
            val translate : String = tvQuince.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPersimmon.setOnClickListener {
            val english : String = persimmon.text.toString()
            val translate : String = tvPersimmon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivNectarine.setOnClickListener {
            val english : String = nectarine.text.toString()
            val translate : String = tvNectarine.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFigs.setOnClickListener {
            val english : String = figs.text.toString()
            val translate : String = tvFigs.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivDatefruit.setOnClickListener {
            val english : String = datefruit.text.toString()
            val translate : String = tvDatefruit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, NewWordsActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
    override fun onResume() {
        super.onResume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
}