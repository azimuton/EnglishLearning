package com.jkdajac.englishlearning

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jkdajac.englishlearning.adapters.WordAdapter
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.LearnedWords
import com.jkdajac.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.RowId

class MainActivity : AppCompatActivity(), WordAdapter.ViewHolder.ItemCallback{
    lateinit var adapter: WordAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<Word>
    lateinit var learnedwordList: ArrayList<LearnedWords>


    @SuppressLint("NotifyDataSetChanged")
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
3
        wordList = ArrayList<Word>()
        learnedwordList = ArrayList<LearnedWords>()
        wordDatabase = AppDatabase.getDatabase(this)
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = WordAdapter(this, wordList, this)
        rvWords.layoutManager = LinearLayoutManager(this)
        rvWords.adapter = adapter

        wordDatabase = AppDatabase.getDatabase(this)

        btGoToAllready.setOnClickListener {
            val addDialog = AlertDialog.Builder(this)
            addDialog
                .setMessage("Вы действительно хотите перенести записи?")
                .setPositiveButton("Ok") { dialog, _ ->
                    getData()
                    wordDatabase.wordDao().copy()
                    wordDatabase.wordDao().deleteAll()
                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(intent);
                    overridePendingTransition(0, 0);
                    Toast.makeText(this, "Записи пересены!", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .setNegativeButton("Отмена") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
        }

            btSave.setOnClickListener {
                if (etEnglishWord.text.isNotEmpty() && etTranslateWord.text.isNotEmpty()) {
                    val englishWord: String = etEnglishWord.text.toString()
                    val translateWord: String = etTranslateWord.text.toString()


                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    Toast.makeText(this, "Поля заполнены!", Toast.LENGTH_LONG)
                        .show()
                    wordDatabase.wordDao().insertWord(word)

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this, "Заполните все поля!",
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

        val addDialog = AlertDialog.Builder(this)
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val word = wordList[index]
                wordDatabase.wordDao().deleteWord(word)
                getData()
                adapter.notifyDataSetChanged()
                finish();
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
    }

    override fun closeItem(index: Int) {
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





