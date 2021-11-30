package com.jkdajac.englishlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.adapters.LearnedWordsAdapter
import com.jkdajac.englishlearning.adapters.WordAdapter
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.LearnedWords
import com.jkdajac.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.activity_learned_words.*
import kotlinx.android.synthetic.main.activity_main.*

class LearnedWordsActivity : AppCompatActivity(), LearnedWordsAdapter.ViewHolder.ItemCallback {

    lateinit var adapter: LearnedWordsAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<LearnedWords>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learned_words)

        ivBackToMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tvBackToMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }

        getMyIntents()

        wordList = ArrayList<LearnedWords>()
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = LearnedWordsAdapter(this, wordList, this)
        rvLernedWords.layoutManager = LinearLayoutManager(this)
        rvLernedWords.adapter = adapter

        wordDatabase = AppDatabase.getDatabase(this)


    }

    fun getData() {
        val wordFromDb: List<LearnedWords> = wordDatabase.learnedwordsDao().getAllLearnedWords()
        wordList.clear()
        wordList.addAll(wordFromDb)
    }

    override fun deleteItem(index: Int) {
        val learnedWords = wordList.get(index)
        wordDatabase.learnedwordsDao().deleteLearnedWords(learnedWords)
        getData()
        adapter.notifyDataSetChanged()
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
}