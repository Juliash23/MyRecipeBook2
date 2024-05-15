package fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myrecipebook.R
import com.example.myrecipebook.videoModel.HomeViewModel
import pojo.Category

class HomeFragment : Fragment(R.layout.activity_main) {
    private lateinit var homeViewModel: HomeViewModel


    companion object{
        const val MEAL_ID="com.example.myrecipebook.fragments.idMeal"
        const val MEAL_NAME="com.example.myrecipebook.fragments.nameMeal"
        const val MEAL_THUMB="com.example.myrecipebook.fragments.thumbMeal"
        const val CATEGORY_NAME=" com.example.myrecipebook.fragments.categoryName"
        const val MEAL_STR=" com.example.myrecipebook.fragments.strMeal"
        const val MEAL_AREA=" com.example.myrecipebook.fragments.strArea"


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeViewModel = ViewModelProviders.of(this)[HomeViewModel::class.java]
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.getCategories()
        observeCategoriesLiveData()


    }

    private fun observeCategoriesLiveData() {
        homeViewModel.observeCategoriesLiveData().observe(viewLifecycleOwner, Observer { categories ->
            categories.forEach{ category ->
                Log.d("test", category.strCategory)
            }
        })
    }
}