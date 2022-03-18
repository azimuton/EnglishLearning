package com.jkdajacs.englishlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.method.TextKeyListener.clear
import android.view.View
import android.view.Window
import android.widget.Toast
import com.jkdajacs.englishlearning.database.worddb.AppDatabase
import com.jkdajacs.englishlearning.database.worddb.LearnedWords
import kotlinx.android.synthetic.main.activity_weather.view.*
import kotlinx.android.synthetic.main.activity_write_word.*

class WriteWordActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    lateinit var resultRandom : LearnedWords

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_write_word)
        wordDatabase = AppDatabase.getDatabase(this)


        btWriteNewWord.setOnClickListener {
            ivWriteRed.visibility = View.GONE
            ivWriteGreen.visibility = View.GONE
            resultRandom = wordDatabase.learnedwordsDao().randoms()
            tvWriteTranslate.text = resultRandom.translateWord
        }
        btWriteVerify.setOnClickListener {
            if(etWriteEnglish.text.isNotEmpty()){
                if(resultRandom.englishWord.equals(etWriteEnglish.text.toString(), true) ){
                    ivWriteRed.visibility = View.GONE
                    ivWriteGreen.visibility = View.VISIBLE
                    Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
                } else{
                    ivWriteGreen.visibility = View.GONE
                    ivWriteRed.visibility = View.VISIBLE
                    Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Не забудьте написать слово!", Toast.LENGTH_SHORT).show()
            }
        }
        ivWriteClear.setOnClickListener {
            etWriteEnglish.text.clear()
        }
    }

    override fun onResume() {
        super.onResume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, LearnedWordsActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}