package worklog5.com.myapplication.screens.main.fragments.sub.contracts

import worklog5.com.myapplication.screens.base.BasePresenter
import worklog5.com.myapplication.screens.base.BaseView

interface SubContract {
    interface View: BaseView {

    }

    interface presenter : BasePresenter<View> {

    }

    interface interactor {
    }
}