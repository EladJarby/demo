package worklog5.com.myapplication.screens.main.fragments.main.impl

import android.view.View
import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import javax.inject.Inject


@FragmentScope
class MainFragmentPresenter @Inject constructor(val interactor: MainFragmentContract.interactor = MainFragmentInteractor(),
                                                val dataManager: DataManager) : MainFragmentContract.presenter {
    private var view: MainFragmentContract.View? = null

    override fun onAttach(view: MainFragmentContract.View) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

}