package com.jkdajac.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.AppDatabase
import com.jkdajac.englishlearning.database.worddb.Word
import com.jkdajac.englishlearning.newwords.NewWordsActivity
import kotlinx.android.synthetic.main.activity_nature.*
import kotlinx.android.synthetic.main.activity_tools.*

class ToolsActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools)
        wordDatabase = AppDatabase.getDatabase(this)

        ivHammer.setOnClickListener {
            val english : String = hammer.text.toString()
            val translate : String = tvHammer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivScrewdrivers.setOnClickListener {
            val english : String = screwdrivers.text.toString()
            val translate : String = tvScrewdrivers.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivPliers.setOnClickListener {
            val english : String = pliers.text.toString()
            val translate : String = tvPliers.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivWrenchs.setOnClickListener {
            val english : String = wrenchs.text.toString()
            val translate : String = tvWrenchs.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivAxe.setOnClickListener {
            val english : String = axe.text.toString()
            val translate : String = tvAxe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSaw.setOnClickListener {
            val english : String = saw.text.toString()
            val translate : String = tvSaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivNail.setOnClickListener {
            val english : String = nail.text.toString()
            val translate : String = tvNail.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSelftappingscrew.setOnClickListener {
            val english : String = selftappingscrew.text.toString()
            val translate : String = tvSelftappingscrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivSandpaper.setOnClickListener {
            val english : String = sandpaper.text.toString()
            val translate : String = tvSandpaper.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivDrill.setOnClickListener {
            val english : String = drill.text.toString()
            val translate : String = tvDrill.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivScrewdriver.setOnClickListener {
            val english : String = screwdriver.text.toString()
            val translate : String = tvScrewdriver.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivLevel.setOnClickListener {
            val english : String = level.text.toString()
            val translate : String = tvLevel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivVise.setOnClickListener {
            val english : String = vise.text.toString()
            val translate : String = tvVise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRouter.setOnClickListener {
            val english : String = router.text.toString()
            val translate : String = tvRouter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivGlue.setOnClickListener {
            val english : String = glue.text.toString()
            val translate : String = tvGlue.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBolt.setOnClickListener {
            val english : String = bolt.text.toString()
            val translate : String = tvBolt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivScrews.setOnClickListener {
            val english : String = screws.text.toString()
            val translate : String = tvScrews.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivWrench.setOnClickListener {
            val english : String = wrench.text.toString()
            val translate : String = tvWrench.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHacksaw.setOnClickListener {
            val english : String = hacksaw.text.toString()
            val translate : String = tvHacksaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivJigsaw.setOnClickListener {
            val english : String = jigsaw.text.toString()
            val translate : String = tvJigsaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivScrew.setOnClickListener {
            val english : String = screw.text.toString()
            val translate : String = tvScrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivWire.setOnClickListener {
            val english : String = wire.text.toString()
            val translate : String = tvWire.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivChisel.setOnClickListener {
            val english : String = chisel.text.toString()
            val translate : String = tvChisel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTicks.setOnClickListener {
            val english : String = ticks.text.toString()
            val translate : String = tvTicks.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivWasher.setOnClickListener {
            val english : String = washer.text.toString()
            val translate : String = tvWasher.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivClamp.setOnClickListener {
            val english : String = clamp.text.toString()
            val translate : String = tvClamp.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivRoulette.setOnClickListener {
            val english : String = roulette.text.toString()
            val translate : String = tvRoulette.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivCalipers.setOnClickListener {
            val english : String = calipers.text.toString()
            val translate : String = tvCalipers.text.toString()
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
}