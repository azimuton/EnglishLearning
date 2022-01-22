package com.jkdajac.englishlearning

import android.content.Intent
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.adapters.LearnedWordsAdapter
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.LearnedWords
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
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        getMyIntents()

        wordList = ArrayList<LearnedWords>()
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = LearnedWordsAdapter(this, wordList, this)
        rvLernedWords.layoutManager = LinearLayoutManager(this)
        rvLernedWords.adapter = adapter

        wordDatabase = AppDatabase.getDatabase(this)

        tvCountLearned.text = wordDatabase.learnedwordsDao().count().toString()
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
                adapter.notifyDataSetChanged()
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
}