package worklog5.com.myapplication.data.model

import com.google.gson.annotations.SerializedName

data class Food(
        @SerializedName("foodItemList") val foodItemList: List<FoodItem>
)