package worklog5.com.myapplication.screens.main.fragments.main.impl

import android.util.Log
import android.view.View
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.data.model.Food
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import javax.inject.Inject


@FragmentScope
class MainFragmentPresenter @Inject constructor(val interactor: MainFragmentContract.interactor = MainFragmentInteractor(),
                                                val dataManager: DataManager) : MainFragmentContract.presenter {
    private var view: MainFragmentContract.View? = null

    override fun onAttach(view: MainFragmentContract.View) {
        this.view = view
        init()
    }

    override fun init() {
        interactor.getJson(dataManager.remoteDataManager.api,"שניצל")
                .enqueue(object: Callback<Food> {
                    override fun onResponse(call: Call<Food>, response: Response<Food>) {
                        view?.setText(response.body().toString())
                    }

                    override fun onFailure(call: Call<Food>, t: Throwable) {
                        Log.d("b","b")
                    }

                })
    }

    override fun onDetach() {
        view = null
    }

}