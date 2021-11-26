package com.jkdajac.englishlearning

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.database.AppDatabase
import com.jkdajac.englishlearning.database.Word
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), WordAdapter.ViewHolder.ItemCallback{
    lateinit var adapter: WordAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<Word>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btClose.setOnClickListener {
            finishAffinity()
        }

        btLearnedWords.setOnClickListener {
            val intent = Intent(this, LearnedWordsActivity :: class.java)
            startActivity(intent)
        }

        getMyIntents()

        wordList = ArrayList<Word>()
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = WordAdapter(this, wordList, this)
        rvWords.layoutManager = LinearLayoutManager(this)
        rvWords.adapter = adapter

        wordDatabase = AppDatabase.getDatabase(this)


            btSave.setOnClickListener {
                if (etEnglishWord.text.isNotEmpty() && etTranslateWord.text.isNotEmpty()) {
                    val englishWord: String = etEnglishWord.text.toString()
                    val translateWord: String = etTranslateWord.text.toString()


                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    Toast.makeText(this, "English word and translation full !", Toast.LENGTH_LONG)
                        .show()
                    wordDatabase.wordDao().insertWord(word)

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this, "Full in the fields" + "\"English word\"" + "and" + "\"Translate\"",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

        fun getData() {
            val wordFromDb: List<Word> = wordDatabase.wordDao().getAll()
            wordList.clear()
            wordList.addAll(wordFromDb)
        }

    override fun deleteItem(index: Int) {
        val word = wordList.get(index)
        wordDatabase.wordDao().deleteWord(word)
        getData()
        adapter.notifyDataSetChanged()
    }


    override fun openItem(index: Int) {
        //tvTranslate.visibility = View.VISIBLE
    }

    override fun closeItem(index: Int) {
        //tvTranslate.visibility = View.GONE
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

//    private fun getItemsFromDb(searchText: String) {
//        var searchText = searchText
//        searchText = "%$searchText%"
//    }




