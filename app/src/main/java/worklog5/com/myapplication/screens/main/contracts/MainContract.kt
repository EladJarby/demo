package worklog5.com.myapplication.screens.main.contracts

import android.support.v4.app.Fragment
import worklog5.com.myapplication.screens.base.BasePresenter
import worklog5.com.myapplication.screens.base.BaseView

interface MainContract {
    interface presenter : BasePresenter<View> {

    }

    interface View: BaseView {

        fun replaceFragment()
    }

    interface Interactor {

    }
}