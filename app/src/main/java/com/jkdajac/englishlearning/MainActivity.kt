package com.jkdajac.englishlearning

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.database.AppDatabase
import com.jkdajac.englishlearning.database.Word
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view.*
import java.util.Observer

class MainActivity : AppCompatActivity(), WordAdapter.ViewHolder.ItemCallback, SearchView.OnQueryTextListener {
    lateinit var adapter: WordAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<Word>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initSearchView()

        btClose.setOnClickListener {
            finishAffinity()
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

//    override fun openItem(index: Int) {
//        tvTranslate.visibility = View.VISIBLE
//    }
//
//    override fun closeItem(index: Int) {
//        tvTranslate.visibility = View.GONE
//    }

    fun getMyIntents(){

        val i = intent

        if(i != null){
            if(i.getStringExtra(MyIntentConstance.I_WORD_KEY) != null){
                etEnglishWord.setText(i.getStringExtra(MyIntentConstance.I_WORD_KEY))
                etTranslateWord.setText(i.getStringExtra(MyIntentConstance.I_TRANSLATE_KEY))
            }
        }
    }

    @SuppressLint("ResourceType")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val search = R.id.searchView
        //searchView = search.actionView as SearchView
        searchView.isSubmitButtonEnabled = true
        searchView.setOnQueryTextListener(object : android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    getItemsFromDb(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    getItemsFromDb(newText)
                }
                return true
            }

        })
        return true
    }



//    fun initSearchView(){
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                if (query != null) {
//                    wordDatabase.wordDao().searchDatabase(query)
//                }
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                if (newText != null) {
//                    wordDatabase.wordDao().searchDatabase(newText)
//                }
//                return true
//            }
//        })
   // }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText != null) {
            wordDatabase.wordDao().searchDatabase(newText)
        }
        return true
    }

    private fun getItemsFromDb(searchText: String) {
        var searchText = searchText
        searchText = "%$searchText%"
    }


}

