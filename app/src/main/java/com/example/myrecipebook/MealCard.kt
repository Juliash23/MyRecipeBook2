package com.example.myrecipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.myrecipebook.activites.MainActivity
import com.example.myrecipebook.databinding.ActivityMealCardBinding
import fragments.HomeFragment

class MealCard : AppCompatActivity() {
    private lateinit var mealId:String
    private lateinit var mealName: String
    private lateinit var mealThumb:String
    private lateinit var binding: ActivityMealCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMealCardBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_meal_card)

        getMealInformationFromIntent()

        setInformationInViews()

    }

    private fun setInformationInViews() {
        Glide.with(applicationContext)
            .load(mealThumb)
            .into(binding.imgMealDetail)

        binding.collapsingToolbar.title = mealName
    }

    private fun getMealInformationFromIntent() {
        val intent = intent
        mealId = intent.getStringExtra(HomeFragment.MEAL_ID)!!
        mealName = intent.getStringExtra(HomeFragment.MEAL_NAME)!!
        mealThumb = intent.getStringExtra(HomeFragment.MEAL_THUMB)!!
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