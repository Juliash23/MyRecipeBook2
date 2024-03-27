package com.example.myrecipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MealCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_card)
    }
    fun onClickCategoryButton(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
    fun onClickButtonFavorite(view: View) {

        val intent = Intent(this, FavoriteMeals::class.java)
        startActivity(intent)

    }
}