package com.jkdajacs.englishlearning.newwords

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.jkdajacs.englishlearning.MainActivity
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.newwords.words.*
import kotlinx.android.synthetic.main.activity_new_words.*


class NewWordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_new_words)
        initAdMob2()

        val formuls = resources.getStringArray(R.array.names)
        val arrayAdapter = ArrayAdapter(this, R.layout.item_adapter, formuls)
        listViewNewWords.adapter = arrayAdapter

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
                        val intent = Intent(this@NewWordsActivity, WashRoomActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    1 -> {
                        val intent = Intent(this@NewWordsActivity, SeaActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    2 ->{
                        val intent = Intent(this@NewWordsActivity, VerbsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    3 -> {
                        val intent = Intent(this@NewWordsActivity, CityActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                   4 -> {
                        val intent = Intent(this@NewWordsActivity, WildAnimalsActivity::class.java)
                        startActivity(intent)
                       animate()
                    }
                    5 -> {
                        val intent = Intent(this@NewWordsActivity, HomeAnimalsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    6 -> {
                        val intent = Intent(this@NewWordsActivity, BuildingActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    7 -> {
                        val intent = Intent(this@NewWordsActivity, ToolsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    8 -> {
                        val intent = Intent(this@NewWordsActivity, KitchenActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    9 -> {
                        val intent = Intent(this@NewWordsActivity, VegetablesActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    10 -> {
                        val intent = Intent(this@NewWordsActivity, WeatherActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    11-> {
                        val intent = Intent(this@NewWordsActivity, NatureActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    12 -> {
                        val intent = Intent(this@NewWordsActivity, FamilyActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    13 -> {
                        val intent = Intent(this@NewWordsActivity, BedRoomActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    14 -> {
                        val intent = Intent(this@NewWordsActivity, TransportActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    15 -> {
                        val intent = Intent(this@NewWordsActivity, FruitsActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    16 -> {
                        val intent = Intent(this@NewWordsActivity, PartsOfBodyActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                    17 -> {
                        val intent = Intent(this@NewWordsActivity, BerryActivity::class.java)
                        startActivity(intent)
                        animate()
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        adView2.resume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }

    override fun onPause() {
        super.onPause()
        adView2.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        adView2.destroy()
    }
    private fun initAdMob2(){
        MobileAds.initialize(this)
        val adRequest2 = AdRequest.Builder().build()
        adView2.loadAd(adRequest2)
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

