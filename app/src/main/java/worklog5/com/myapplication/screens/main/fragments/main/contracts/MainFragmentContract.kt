package worklog5.com.myapplication.screens.main.fragments.main.contracts

import worklog5.com.myapplication.screens.base.BasePresenter
import worklog5.com.myapplication.screens.base.BaseView

interface MainFragmentContract {
    interface View: BaseView {

    }

    interface presenter : BasePresenter<View> {

    }

    interface interactor {

    }
}