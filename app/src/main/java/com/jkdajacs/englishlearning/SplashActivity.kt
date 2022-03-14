package com.jkdajacs.englishlearning

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity(), CoroutineScope {

    private val job = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    @SuppressLint("Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  w : Window = window
        w.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        setContentView(R.layout.activity_splash)

        CoroutineScope(Dispatchers.Main).launch {
            progressBar.max = 1000
            val value = 1000
            ObjectAnimator.ofInt(progressBar, "progress", value).setDuration(3100).start()
            delay(3100)
            startActivity(Intent(this@SplashActivity, MainActivity :: class.java))
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

        async{
            delay(300)
            animBooks()
        }
        async {
            delay(1100)
            animEnglish()
        }
        async {
            delay(2000)
            animWord()
        }

//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity :: class.java))
//            overridePendingTransition(0, R.anim.open_activity)
//            finish()
//        }, 800)
    }
    fun animBooks(){
        val animation = AnimationUtils.loadAnimation(this, R.anim.back_open)
        ivSplash.startAnimation(animation)
        ivSplash.visibility = View.VISIBLE
    }
    fun animEnglish(){
        val animation = AnimationUtils.loadAnimation(this, R.anim.back_open)
        tvSplashE.startAnimation(animation)
        tvSplashE.visibility = View.VISIBLE
    }
    fun animWord(){
        val animation = AnimationUtils.loadAnimation(this, R.anim.back_open)
        tvSplashW.startAnimation(animation)
        tvSplashW.visibility = View.VISIBLE
    }
}