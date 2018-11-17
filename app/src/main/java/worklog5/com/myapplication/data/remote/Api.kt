package worklog5.com.myapplication.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import worklog5.com.myapplication.data.model.Food

interface  Api {
    @GET("/try.php")
    fun getJson(@Query("food") word: String) : Call<Food>
}