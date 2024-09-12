package com.example.myrecipebook.activites

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecipebook.AdapterClass
import com.example.myrecipebook.DataClass
import com.example.myrecipebook.FavoriteMeals
import com.example.myrecipebook.MealCard
import com.example.myrecipebook.R
import com.example.myrecipebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var datalist:ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList: Array<String>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.breakfast,
            R.drawable.pasta,
            R.drawable.soup,
            R.drawable.chicken,
            R.drawable.pork,
            R.drawable.beef,
            R.drawable.seafood,
            R.drawable.dessert,
            R.drawable.vegan,
            R.drawable.vegetarian
        )
        titleList = arrayOf(
            "Завтраки",
            "Паста",
            "Супы",
            "Курица",
            "Свинина",
            "Говядина",
            "Морские продукты",
            "Десерты",
            "Веганское",
            "Вегатерианское")

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf<DataClass>()
        getData()

    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            datalist.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(datalist)
    }

    fun onClickButtonFavorite(view: View) {

        val intent = Intent(this, FavoriteMeals::class.java)
        startActivity(intent)

    }

    fun onClickButtonMeal(view: View) {

        val intent = Intent(this, MealCard::class.java)
        startActivity(intent)

    }

}