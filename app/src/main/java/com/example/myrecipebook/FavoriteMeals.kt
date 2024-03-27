package com.example.myrecipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FavoriteMeals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_meals)
    }
    fun onClickCategoryButton(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}