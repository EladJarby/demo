package worklog5.com.myapplication.data.model

import com.google.gson.annotations.SerializedName

data class FoodItem(
        @SerializedName("foodName") val foodName: String,
        @SerializedName("counter") val counter: Int,
        @SerializedName("isAllowed") val isAllowed: Int
)