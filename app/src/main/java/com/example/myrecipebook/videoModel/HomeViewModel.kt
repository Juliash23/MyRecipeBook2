package com.example.myrecipebook.videoModel


import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myrecipebook.retrofit.RetrofitInstance
import pojo.Category
import pojo.CategoryList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import androidx.lifecycle.LiveData


class HomeViewModel():ViewModel() {
    val liveData = MutableLiveData<Int>()

    fun getCategories() {
        RetrofitInstance.foodApi.getCategories().enqueue(object : Callback<CategoryList> {
            override fun onResponse(call: Call<CategoryList>, response: Response<CategoryList>) {
                response.body()?.let { categoryList ->
                    categoriesLiveData.postValue(categoryList.categories)
                }
            }

            override fun onFailure(call: Call<CategoryList>, t: Throwable) {
                Log.e("HomeViewModel", t.message.toString())
            }
        })
    }

    private val categoriesLiveData = MutableLiveData<List<Category>>()

    fun observeCategoriesLiveData(): LiveData<List<Category>> {
        return categoriesLiveData
    }



}