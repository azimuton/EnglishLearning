package com.jkdajac.englishlearning.newwords.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.newwords.NewWordsActivity

class BuildingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_building)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, NewWordsActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}