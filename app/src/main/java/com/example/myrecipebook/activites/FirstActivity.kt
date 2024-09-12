package com.example.myrecipebook.activites

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Handler
import android.view.animation.DecelerateInterpolator
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import com.example.myrecipebook.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val handler = Handler()
        val delay: Long = 3500 // время задержки в миллисекундах (в данном случае 3,5 секунд)

        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, delay)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar2)

        progressBar.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,
            R.color.black
        ))
        val animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100)
        animation.duration = 4000 // Продолжительность анимации в миллисекундах
        animation.interpolator = DecelerateInterpolator() // Интерполятор для изменения скорости анимации

        animation.start()

    }
}