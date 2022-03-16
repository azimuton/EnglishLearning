package com.jkdajacs.englishlearning.newwords.frasalverbs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.material.tabs.TabLayoutMediator
import com.jkdajacs.englishlearning.MainActivity
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.newwords.NewWordsActivity
import com.jkdajacs.englishlearning.newwords.frasalverbs.fragments.FrasalVerbsFragment
import com.jkdajacs.englishlearning.newwords.frasalverbs.fragments.PopularExpressionsFragment
import kotlinx.android.synthetic.main.activity_frasal_verbs.*
import kotlinx.android.synthetic.main.activity_main.*

class FrasalVerbsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_frasal_verbs)
        initAdMob4()
        initial()
    }

    private fun initial() {
        vpPager2.adapter = FrasalAdapter(this)
        tabLayout.tabIconTint = null
        TabLayoutMediator(tabLayout, vpPager2){
            tab, pos ->
            when(pos) {
                0 -> {
                    tab.text = "фразовые глаголы"
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.two))
                }
                    1 -> {
                        tab.text = "популярные выражения"
                        tab.icon?.setTint(ContextCompat.getColor(this, R.color.two))
                    }
                }

        }.attach()
    }

    override fun onResume() {
        super.onResume()
        adView4.resume()
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
    override fun onPause() {
        super.onPause()
        adView4.pause()
    }
    override fun onDestroy() {
        super.onDestroy()
        adView4.destroy()
    }
    private fun initAdMob4(){
        MobileAds.initialize(this)
        val adRequest4 = AdRequest.Builder().build()
        adView4.loadAd(adRequest4)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}