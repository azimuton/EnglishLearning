package com.jkdajac.englishlearning.foto

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkdajac.englishlearning.MainActivity
import com.jkdajac.englishlearning.R
import kotlinx.android.synthetic.main.activity_foto.*

class FotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto)

        val pages = arrayListOf<Page>(

            Page(BitmapFactory.decodeResource(resources, R.drawable.f1)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f2)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f3)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f4)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f5)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f7)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f8)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f9)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f10)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f11)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f12)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f13)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f14)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f15)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f16)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f17)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f19)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f20)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f21)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f23)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f24)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f25)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f26)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f27)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f28)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.f29)),

            )

        vpViewPager.adapter = PagesAdapter(pages,supportFragmentManager)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}