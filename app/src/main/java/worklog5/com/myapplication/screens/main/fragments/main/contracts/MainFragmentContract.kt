package worklog5.com.myapplication.screens.main.fragments.main.contracts

import retrofit2.Call
import worklog5.com.myapplication.data.model.Food
import worklog5.com.myapplication.data.remote.Api
import worklog5.com.myapplication.screens.base.BasePresenter
import worklog5.com.myapplication.screens.base.BaseView

interface MainFragmentContract {
    interface View: BaseView {
        fun setText(toString: String)

    }

    interface presenter : BasePresenter<View> {

        fun init()
    }

    interface interactor {
        fun getJson(api: Api, word: String) : Call<Food>

    }
}