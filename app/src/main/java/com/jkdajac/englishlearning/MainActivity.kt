package com.jkdajac.englishlearning

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.jkdajac.englishlearning.adapters.WordAdapter
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.LearnedWords
import com.jkdajac.englishlearning.database.worddb.Word
import com.jkdajac.englishlearning.foto.FotoActivity
import com.jkdajac.englishlearning.newwords.NewWordsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), WordAdapter.ViewHolder.ItemCallback{
    lateinit var adapter: WordAdapter
    lateinit var wordDatabase: AppDatabase
    lateinit var wordList: ArrayList<Word>
    lateinit var learnedwordList: ArrayList<LearnedWords>
    private var  interAd : InterstitialAd? = null

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_main)
        (application as AppMainState).showAdIfAvailable(this){

        }

        initAdMob()

        ivFoto.setOnClickListener {
            val intent = Intent(this, FotoActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        fabNewWords.setOnClickListener {
            showInterAd()
            val intent = Intent(this, NewWordsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        btClose.setOnClickListener {
            finishAffinity()
        }

        btLearnedWords.setOnClickListener {
            showInterAd()
            val intent = Intent(this, LearnedWordsActivity :: class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        getMyIntents()

        wordList = ArrayList<Word>()
        learnedwordList = ArrayList<LearnedWords>()
        wordDatabase = AppDatabase.getDatabase(this)
        wordDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = WordAdapter(this, this)
        rvWords.layoutManager = LinearLayoutManager(this)
        rvWords.adapter = adapter
        adapter.submitList(wordList)


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
                    Toast.makeText(this, "Поля заполнены!", Toast.LENGTH_SHORT).show()
                    wordDatabase.wordDao().insertWord(word)

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this, "Заполните пустые поля!",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }


        }
    override fun onResume() {
        super.onResume()
        adView.resume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
    override fun onPause() {
        super.onPause()
        adView.pause()
    }
    override fun onDestroy() {
        super.onDestroy()
        adView.destroy()
    }
    private fun initAdMob(){
        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
      fun loadInterAd(){
        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(this, "ca-app-pub-3940256099942544/1033173712", adRequest,
        object : InterstitialAdLoadCallback(){
            override fun onAdFailedToLoad(p0: LoadAdError) {
                interAd = null
            }

            override fun onAdLoaded(ad: InterstitialAd) {
                interAd = ad
            }
        })
    }

     fun showInterAd(){
        if(interAd != null){
            interAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdDismissedFullScreenContent() {
                    shows()
                    interAd = null
                    loadInterAd()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    shows()
                    interAd = null
                    loadInterAd()
                }

                override fun onAdShowedFullScreenContent() {
                    interAd = null
                    loadInterAd()
                }
            }
            interAd?.show(this)
        } else {
            shows()
        }
    }
    fun shows(){
        //Toast.makeText(this, "Межстраничная реклама!", Toast.LENGTH_LONG).show()
    }
        fun getData() {
            val wordFromDb: List<Word> = wordDatabase.wordDao().getAll()
            wordList.clear()
            wordList.addAll(wordFromDb)
        }
    @SuppressLint("NotifyDataSetChanged")
    override fun deleteItem(index: Int) {

        val addDialog = AlertDialog.Builder(this)
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val word = wordList[index]
                wordDatabase.wordDao().deleteWord(word)
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






