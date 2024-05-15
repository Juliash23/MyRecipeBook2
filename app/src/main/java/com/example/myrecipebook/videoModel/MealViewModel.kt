package com.example.myrecipebook.videoModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myrecipebook.MealCard

class MealViewModel(): ViewModel() {
    private var mutableMeal = MutableLiveData<List<MealCard>>()



    fun observeMeal(): LiveData<List<MealCard>> {
        return mutableMeal
    }
}