package com.example.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fadeIn= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
        image.startAnimation(fadeIn)
        text.startAnimation(fadeIn)


        Handler().postDelayed(Runnable {
                var intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
            finish()
        },3000)
    }
}