package com.example.myrecipebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


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
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf<DataClass>()
        getData()

    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass =DataClass(imageList[i], titleList[i])
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