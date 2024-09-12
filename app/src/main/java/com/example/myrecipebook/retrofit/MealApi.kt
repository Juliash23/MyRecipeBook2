package com.example.myrecipebook.retrofit


import com.example.myrecipebook.Meals
import pojo.Category
import pojo.CategoryList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("lookup.php")
    fun  getMealDetails(@Query("i")id:String) : Call<Meals>

    @GET("categories.php")
    fun getCategories(): Call<CategoryList>

    @GET("filter.php?")
    fun getMealsByCategory(@Query("i") category:String): Call<Meals>

}