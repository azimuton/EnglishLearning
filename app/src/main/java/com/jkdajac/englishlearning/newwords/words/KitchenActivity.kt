package com.jkdajac.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.Word
import com.jkdajac.englishlearning.newwords.NewWordsActivity
import kotlinx.android.synthetic.main.activity_home_animals.*
import kotlinx.android.synthetic.main.activity_kitchen.*

class KitchenActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_kitchen)
        wordDatabase = AppDatabase.getDatabase(this)

        ivKitchen.setOnClickListener {
            val english : String = kitchen.text.toString()
            val translate : String = tvKitchen.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSpoon.setOnClickListener {
            val english : String = spoon.text.toString()
            val translate : String = tvSpoon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFork.setOnClickListener {
            val english : String = fork.text.toString()
            val translate : String = tvFork.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivKnife.setOnClickListener {
            val english : String = knife.text.toString()
            val translate : String = tvKnife.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTable.setOnClickListener {
            val english : String = table.text.toString()
            val translate : String = tvTable.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivChair.setOnClickListener {
            val english : String = chair.text.toString()
            val translate : String = tvChair.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivKithenstove.setOnClickListener {
            val english : String = kithenstove.text.toString()
            val translate : String = tvKithenstove.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSink.setOnClickListener {
            val english : String = sink.text.toString()
            val translate : String = tvSink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBreadbox.setOnClickListener {
            val english : String = breadbox.text.toString()
            val translate : String = tvBreadbox.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHodgepodge.setOnClickListener {
            val english : String = hodgepodge.text.toString()
            val translate : String = tvHodgepodge.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRefrigerator.setOnClickListener {
            val english : String = refrigerator.text.toString()
            val translate : String = tvRefrigerator.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPlate.setOnClickListener {
            val english : String = plate.text.toString()
            val translate : String = tvPlate.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCup.setOnClickListener {
            val english : String = cup.text.toString()
            val translate : String = tvCup.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSaucer.setOnClickListener {
            val english : String = saucer.text.toString()
            val translate : String = tvSaucer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivKithencupboard.setOnClickListener {
            val english : String = kithencupboard.text.toString()
            val translate : String = tvKithencupboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFoodprocessor.setOnClickListener {
            val english : String = foodprocessor.text.toString()
            val translate : String = tvFoodprocessor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBin.setOnClickListener {
            val english : String = bin.text.toString()
            val translate : String = tvBin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHood.setOnClickListener {
            val english : String = hood.text.toString()
            val translate : String = tvHood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivOven.setOnClickListener {
            val english : String = oven.text.toString()
            val translate : String = tvOven.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBurner.setOnClickListener {
            val english : String = burner.text.toString()
            val translate : String = tvBurner.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPan.setOnClickListener {
            val english : String = pan.text.toString()
            val translate : String = tvPan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivFryingpan.setOnClickListener {
            val english : String = fryingpan.text.toString()
            val translate : String = tvFryingpan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCuttingboard.setOnClickListener {
            val english : String = cuttingboard.text.toString()
            val translate : String = tvCuttingboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBottleopener.setOnClickListener {
            val english : String = bottleopener.text.toString()
            val translate : String = tvBottleopener.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCorkscrew.setOnClickListener {
            val english : String = corkscrew.text.toString()
            val translate : String = tvCorkscrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGrater.setOnClickListener {
            val english : String = grater.text.toString()
            val translate : String = tvGrater.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivJuicer.setOnClickListener {
            val english : String = juicer.text.toString()
            val translate : String = tvJuicer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBowl.setOnClickListener {
            val english : String = bowl.text.toString()
            val translate : String = tvBowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivJar.setOnClickListener {
            val english : String = jar.text.toString()
            val translate : String = tvJar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivJug.setOnClickListener {
            val english : String = jug.text.toString()
            val translate : String = tvJug.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivShugarbowl.setOnClickListener {
            val english : String = shugarbowl.text.toString()
            val translate : String = tvShugarbowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTray.setOnClickListener {
            val english : String = tray.text.toString()
            val translate : String = tvTray.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTableware.setOnClickListener {
            val english : String = tableware.text.toString()
            val translate : String = tvTableware.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, NewWordsActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
    override fun onResume() {
        super.onResume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
}