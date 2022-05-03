package com.jkdajacs.englishlearning.api

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.Translator
import com.google.mlkit.nl.translate.TranslatorOptions
import com.jkdajacs.englishlearning.MainActivity
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.database.worddb.AppDatabase
import com.jkdajacs.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.activity_translating.*

lateinit var  russianEnglishTranslator : Translator
lateinit var  englishRussianTranslator : Translator
var text : String = ""
class TranslatingActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_translating)

        btChangeLanguageTranslate.setOnClickListener(firstButtonListener)

        wordDatabase = AppDatabase.getDatabase(this)

        Glide.with(this)
            .asGif()
            .load(R.drawable.giphy)
            .into(ivBackTranslatingActivity)

        ivBackTranslatingActivity.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }
        ivDeleteEnterWordTranslate.setOnClickListener {
            etEnterWord.text.clear()
            tvGetTranslate.text = ""
            val  w : Window = window
            w.decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        }
        btSaveTranslate.setOnClickListener {
            if (etEnterWord.text.isNotEmpty() && tvGetTranslate.text.isNotEmpty()) {
                if(tvEng.text == "English" && tvRuss.text == "Русский"){
                    val englishWord: String = etEnterWord.text.toString()
                    val translateWord: String = tvGetTranslate.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    wordDatabase.wordDao().insertWord(word)
                } else {
                    val englishWord: String = etEnterWord.text.toString()
                    val translateWord: String = tvGetTranslate.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    wordDatabase.wordDao().insertWord(word)
                }
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this, "Нет данных для сохранения!", Toast.LENGTH_SHORT).show()
            }
        }
        btToTranslate.setOnClickListener {
            if (etEnterWord.text.isNotEmpty()){
                text = etEnterWord.text.toString()
                if(tvEng.text == "English" && tvRuss.text == "Русский"){
                    prepareLangTransMode2()
                }else{
                    prepareLangTransMode()
                }
            } else {
                Toast.makeText(this, "Напишите слово для перевода!", Toast.LENGTH_SHORT).show()
            }

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
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }

    private fun prepareLangTransMode() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.RUSSIAN)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()
         russianEnglishTranslator = Translation.getClient(options)
        russianEnglishTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
               translateWord()
            }
            .addOnFailureListener { exception ->
               tvGetTranslate.text = "Error: ${exception.message}"
            }
    }
    private fun prepareLangTransMode2() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ENGLISH)
            .setTargetLanguage(TranslateLanguage.RUSSIAN)
            .build()
       englishRussianTranslator = Translation.getClient(options)
        englishRussianTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord2()
            }
            .addOnFailureListener { exception ->
                tvGetTranslate.text = "Error: ${exception.message}"
            }
    }
    private fun translateWord() {
        russianEnglishTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                tvGetTranslate.text = translatedText
            }
            .addOnFailureListener { exception ->
                tvGetTranslate.text = "Error: ${exception.message}"
            }
    }
    private fun translateWord2() {
        englishRussianTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                tvGetTranslate.text = translatedText
            }
            .addOnFailureListener { exception ->
                tvGetTranslate.text = "Error: ${exception.message}"
            }
    }

    var firstButtonListener: View.OnClickListener? = View.OnClickListener {
        // меняем обработчик нажатия кнопки на второй
        tvEng.text = "Русский"
        tvRuss.text = "English"
        btChangeLanguageTranslate.setOnClickListener(secondButtonListener)
    }

    var secondButtonListener: View.OnClickListener = View.OnClickListener {
        // возвращаем первый обработчик нажатия кнопки
        tvEng.text = "English"
        tvRuss.text = "Русский"
        btChangeLanguageTranslate.setOnClickListener(firstButtonListener)
    }
}