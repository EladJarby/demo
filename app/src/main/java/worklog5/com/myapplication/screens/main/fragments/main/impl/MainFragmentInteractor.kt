package worklog5.com.myapplication.screens.main.fragments.main.impl

import retrofit2.Call
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.data.model.Food
import worklog5.com.myapplication.data.remote.Api
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import javax.inject.Inject


@FragmentScope
class MainFragmentInteractor @Inject constructor() : MainFragmentContract.interactor {
    override fun getJson(api: Api, word: String): Call<Food> {
        return api.getJson(word)
    }
}