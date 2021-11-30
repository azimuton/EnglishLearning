package com.jkdajac.englishlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.adapters.LearnedWordsAdapter
import com.jkdajac.englishlearning.adapters.WordAdapter
import com.jkdajac.englishlearning.database.lernedwordsdb.AppDatabaseLearned
import com.jkdajac.englishlearning.database.lernedwordsdb.LearnedWords
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.activity_learned_words.*
import kotlinx.android.synthetic.main.activity_main.*

class LearnedWordsActivity : AppCompatActivity(), LearnedWordsAdapter.ViewHolder.ItemCallback {

    lateinit var adapter: LearnedWordsAdapter
    lateinit var learnedwordsDatabase: AppDatabaseLearned
    lateinit var learnedwordsList: ArrayList<LearnedWords>

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

        learnedwordsList = ArrayList<LearnedWords>()
        learnedwordsDatabase = AppDatabaseLearned.getDatabase(this)
        getData()
        adapter = LearnedWordsAdapter(this,learnedwordsList, this)
        rvLernedWords.layoutManager = LinearLayoutManager(this)
        rvLernedWords.adapter = adapter

        learnedwordsDatabase = AppDatabaseLearned.getDatabase(this)

    }

    fun getData() {
        val wordFromDb: List<LearnedWords> = learnedwordsDatabase.learnedwordsDao().getAll()
        learnedwordsList.clear()
        learnedwordsList.addAll(wordFromDb)
    }

    override fun deleteItem(index: Int) {
        val learnedwords = learnedwordsList.get(index)
        learnedwordsDatabase.learnedwordsDao().deleteWord(learnedwords)
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