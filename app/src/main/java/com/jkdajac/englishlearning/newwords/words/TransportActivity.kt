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
import kotlinx.android.synthetic.main.activity_berry.*
import kotlinx.android.synthetic.main.activity_transport.*

class TransportActivity : AppCompatActivity() {
    lateinit var wordDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_transport)
        wordDatabase = AppDatabase.getDatabase(this)

        ivBus.setOnClickListener {
            val english : String = bus.text.toString()
            val translate : String = tvBus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivAutomobile.setOnClickListener {
            val english : String = automobile.text.toString()
            val translate : String = tvAutomobile.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTrolleybus.setOnClickListener {
            val english : String = trolleybus.text.toString()
            val translate : String = tvTrolleybus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTram.setOnClickListener {
            val english : String = tram.text.toString()
            val translate : String = tvTram.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTruck.setOnClickListener {
            val english : String = truck.text.toString()
            val translate : String = tvTruck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivDumptruck.setOnClickListener {
            val english : String = dumptruck.text.toString()
            val translate : String = tvDumptruck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTractor.setOnClickListener {
            val english : String = tractor.text.toString()
            val translate : String = tvTractor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMotorcycle.setOnClickListener {
            val english : String = motorcycle.text.toString()
            val translate : String = tvMotorcycle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBike.setOnClickListener {
            val english : String = bike.text.toString()
            val translate : String = tvBike.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTaxi.setOnClickListener {
            val english : String = taxi.text.toString()
            val translate : String = tvTaxi.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMinibus.setOnClickListener {
            val english : String = minibus.text.toString()
            val translate : String = tvMinibus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivTrain.setOnClickListener {
            val english : String = train.text.toString()
            val translate : String = tvTrain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivElectrictrain.setOnClickListener {
            val english : String = electrictrain.text.toString()
            val translate : String = tvElectrictrain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivAirplane.setOnClickListener {
            val english : String = airplane.text.toString()
            val translate : String = tvAirplane.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivConveyor.setOnClickListener {
            val english : String = conveyor.text.toString()
            val translate : String = tvConveyor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHorsedrawn.setOnClickListener {
            val english : String = horsedrawn.text.toString()
            val translate : String = tvHorsedrawn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMetro.setOnClickListener {
            val english : String = metro.text.toString()
            val translate : String = tvMetro.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivHelicopter.setOnClickListener {
            val english : String = helicopter.text.toString()
            val translate : String = tvHelicopter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivShip.setOnClickListener {
            val english : String = ship.text.toString()
            val translate : String = tvShip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivMope.setOnClickListener {
            val english : String = mope.text.toString()
            val translate : String = tvMope.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBoat.setOnClickListener {
            val english : String = boat.text.toString()
            val translate : String = tvBoat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivYacht.setOnClickListener {
            val english : String = yacht.text.toString()
            val translate : String = tvYacht.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(this, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivBarge.setOnClickListener {
            val english : String = barge.text.toString()
            val translate : String = tvBarge.text.toString()
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