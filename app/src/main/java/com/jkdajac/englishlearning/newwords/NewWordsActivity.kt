package com.jkdajac.englishlearning.newwords

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jkdajac.englishlearning.MainActivity
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.newwords.words.*
import kotlinx.android.synthetic.main.activity_new_words.*


class NewWordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_words)

        val formuls = resources.getStringArray(R.array.names)
        val arrayAdapter = ArrayAdapter(this, R.layout.item_adapter, formuls)
        listViewNewWords.adapter = arrayAdapter


        searchViewNewWords.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if(formuls.contains (query)){
                    arrayAdapter. filter .filter(query)
                }else{
                    Toast.makeText(this@NewWordsActivity ,"Соответствие не найдено",
                        Toast.LENGTH_SHORT ).show()
                }
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                arrayAdapter.filter .filter (newText)
                return false
            }
        })


        listViewNewWords.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?,
                position: Int, id: Long
            ) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {
                        val intent = Intent(this@NewWordsActivity, FamilyActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    1 -> {
                        val intent = Intent(this@NewWordsActivity, HomeAnimalsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    2 ->{
                        val intent = Intent(this@NewWordsActivity, WildAnimalsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    3 -> {
                        val intent = Intent(this@NewWordsActivity, PartsOfBodyActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                   4 -> {
                        val intent = Intent(this@NewWordsActivity, KitchenActivity::class.java)
                        startActivity(intent)
                       animate()
                    }
                    5 -> {
                        val intent = Intent(this@NewWordsActivity, BedRoomActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    6 -> {
                        val intent = Intent(this@NewWordsActivity, WashRoomActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    7 -> {
                        val intent = Intent(this@NewWordsActivity, CityActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    8 -> {
                        val intent = Intent(this@NewWordsActivity, NatureActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    9 -> {
                        val intent = Intent(this@NewWordsActivity, VegetablesActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    10 -> {
                        val intent = Intent(this@NewWordsActivity, FruitsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    11-> {
                        val intent = Intent(this@NewWordsActivity, BerryActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    12 -> {
                        val intent = Intent(this@NewWordsActivity, TransportActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    13 -> {
                        val intent = Intent(this@NewWordsActivity, ToolsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    14 -> {
                        val intent = Intent(this@NewWordsActivity, BuildingActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    15 -> {
                        val intent = Intent(this@NewWordsActivity, VerbsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    16 -> {
                        val intent = Intent(this@NewWordsActivity, SeaActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    17 -> {
                        val intent = Intent(this@NewWordsActivity, WeatherActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                }
            }
        }
    }
    fun animate(){
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}

