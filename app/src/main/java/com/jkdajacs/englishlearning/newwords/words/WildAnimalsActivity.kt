package com.jkdajacs.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.database.worddb.AppDatabase
import com.jkdajacs.englishlearning.database.worddb.Word
import com.jkdajacs.englishlearning.newwords.NewWordsActivity
import kotlinx.android.synthetic.main.activity_wild_animals.*

class WildAnimalsActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_wild_animals)
        wordDatabase = AppDatabase.getDatabase(this)

        ivWolf.setOnClickListener {
            val english : String = wolf.text.toString()
            val translate : String = tvWolf.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFox.setOnClickListener {
            val english : String = fox.text.toString()
            val translate : String = tvFox.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFrog.setOnClickListener {
            val english : String = frog.text.toString()
            val translate : String = tvFrog.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivDeer.setOnClickListener {
            val english : String = deer.text.toString()
            val translate : String = tvDeer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBear.setOnClickListener {
            val english : String = bear.text.toString()
            val translate : String = tvBear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivLion.setOnClickListener {
            val english : String = lion.text.toString()
            val translate : String = tvLion.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTiger.setOnClickListener {
            val english : String = tiger.text.toString()
            val translate : String = tvTiger.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBoar.setOnClickListener {
            val english : String = boar.text.toString()
            val translate : String = tvBoar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSalmon.setOnClickListener {
            val english : String = salmon.text.toString()
            val translate : String = tvSalmon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBison.setOnClickListener {
            val english : String = bison.text.toString()
            val translate : String = tvBison.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivZebra.setOnClickListener {
            val english : String = zebra.text.toString()
            val translate : String = tvZebra.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivLynx.setOnClickListener {
            val english : String = lynx.text.toString()
            val translate : String = tvLynx.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPuma.setOnClickListener {
            val english : String = puma.text.toString()
            val translate : String = tvPuma.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRhinoceros.setOnClickListener {
            val english : String = rhinoceros.text.toString()
            val translate : String = tvRhinoceros.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivElephant.setOnClickListener {
            val english : String = elephant.text.toString()
            val translate : String = tvElephant.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBeaver.setOnClickListener {
            val english : String = beaver.text.toString()
            val translate : String = tvBeaver.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRat.setOnClickListener {
            val english : String = rat.text.toString()
            val translate : String = tvRat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBird.setOnClickListener {
            val english : String = bird.text.toString()
            val translate : String = tvBird.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHyena.setOnClickListener {
            val english : String = hyena.text.toString()
            val translate : String = tvHyena.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSnake.setOnClickListener {
            val english : String = snake.text.toString()
            val translate : String = tvSnake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMonkey.setOnClickListener {
            val english : String = monkey.text.toString()
            val translate : String = tvMonkey.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHippopotamus.setOnClickListener {
            val english : String = hippopotamus.text.toString()
            val translate : String = tvHippopotamus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCrocodile.setOnClickListener {
            val english : String = crocodile.text.toString()
            val translate : String = tvCrocodile.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBorsuk.setOnClickListener {
            val english : String = borsuk.text.toString()
            val translate : String = tvBorsuk.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSquirrel.setOnClickListener {
            val english : String = squirrel.text.toString()
            val translate : String = tvSquirrel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGiraffe.setOnClickListener {
            val english : String = giraffe.text.toString()
            val translate : String = tvGiraffe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivKangaroo.setOnClickListener {
            val english : String = kangaroo.text.toString()
            val translate : String = tvKangaroo.text.toString()
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