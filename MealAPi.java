interface MealApi {



    @GET("filter.php?")

    fun getRecipeByCountryName(@Query("a") countryName : String) : Call<Recipe>
}
    object MealInstance {



        val api : MealApi by lazy {

        Retrofit.Builder()

        .baseUrl("https://www.themealdb.com/api/json/v1/1/")

        .addConverterFactory(GsonConverterFactory.create())

        .build()

        .create(MealApi::class.java)

        }
        }