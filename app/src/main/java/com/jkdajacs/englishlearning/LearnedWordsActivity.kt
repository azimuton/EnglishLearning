package com.jkdajacs.englishlearning

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.jkdajacs.englishlearning.adapters.LearnedWordsAdapter
import com.jkdajacs.englishlearning.database.worddb.AppDatabase
import com.jkdajacs.englishlearning.database.worddb.LearnedWords
import kotlinx.android.synthetic.main.activity_learned_words.*
import kotlinx.android.synthetic.main.activity_main.*

class LearnedWordsActivity : AppCompatActivity(), LearnedWordsAdapter.ViewHolder.ItemCallback {

    lateinit var adapter: LearnedWordsAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<LearnedWords>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_learned_words)
        //initAdMob3()

        ivBackToMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        getMyIntents()

        wordList = ArrayList<LearnedWords>()
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = LearnedWordsAdapter(this,  this)
        rvLernedWords.layoutManager = LinearLayoutManager(this)
        rvLernedWords.adapter = adapter
        adapter.submitList(wordList)

        wordDatabase = AppDatabase.getDatabase(this)

        tvCountLearned.text = wordDatabase.learnedwordsDao().count().toString()

        btRandomLearned.setOnClickListener {
            randomLearned()
        }
        ivOpenEyeLearnedRandom.setOnClickListener {
            tvTRandom.visibility = View.VISIBLE
        }
        ivCloseEyeLearnedRandom.setOnClickListener {
            tvTRandom.visibility = View.GONE
        }
        ivTwoDelRandom.setOnClickListener {
            tvWRandom.text = ""
            tvTRandom.text = ""
            tvTRandom.visibility = View.GONE
        }
        ivChangeLanguage.setOnClickListener {
            changeLanguage()
        }
    }

    override fun onResume() {
        super.onResume()
        //adView3.resume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }

    override fun onPause() {
        super.onPause()
        //adView3.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        //adView3.destroy()
    }
    private fun initAdMob3(){
        MobileAds.initialize(this)
        val adRequest3 = AdRequest.Builder().build()
       // adView3.loadAd(adRequest3)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }

    fun getData() {
        val wordFromDb: List<LearnedWords> = wordDatabase.learnedwordsDao().getAllLearnedWords()
        wordList.clear()
        wordList.addAll(wordFromDb)

    }

    override fun deleteItem(index: Int) {

        val addDialog = AlertDialog.Builder(this)
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val learnedWords = wordList[index]
                wordDatabase.learnedwordsDao().deleteLearnedWords(learnedWords)
                tvCountLearned.text = wordDatabase.learnedwordsDao().count().toString()
                getData()
                adapter.submitList(wordList)
                overridePendingTransition(0, 0);
                startActivity(intent);
                overridePendingTransition(0, 0);
                Toast.makeText(this, "Запись удалена!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }

    override fun openItem(index: Int) {
        TODO("Not yet implemented")
    }

    override fun closeItem(index: Int) {
        TODO("Not yet implemented")
    }

    fun getMyIntents(){

        val i = intent

        if(i != null){
            if(i.getStringExtra(MyIntentConstance.I_WORD_KEY) != null){
                etEnglishWord.setText(i.getStringExtra(MyIntentConstance.I_WORD_KEY))
                etTranslateWord.setText(i.getStringExtra(MyIntentConstance.I_TRANSLATE_KEY))
            }
        }
    }
    fun randomLearned(){
        val resultRandom = wordDatabase.learnedwordsDao().randoms()
        if(resultRandom != null){
            tvWRandom.text = resultRandom.englishWord
            tvTRandom.text = resultRandom.translateWord
        } else{
            Toast.makeText(this, "Нет слов для отображения!", Toast.LENGTH_SHORT).show()
        }
    }

    fun changeLanguage() {
        val resultRandom = wordDatabase.learnedwordsDao().randoms()
        if(resultRandom != null){
            tvWRandom.text = resultRandom.translateWord
            tvTRandom.text = resultRandom.englishWord
        } else{
            Toast.makeText(this, "Нет слов для отображения!", Toast.LENGTH_SHORT).show()
        }
    }
}