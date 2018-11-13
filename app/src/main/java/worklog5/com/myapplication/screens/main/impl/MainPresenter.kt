package worklog5.com.myapplication.screens.main.impl

import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.dagger.scopes.ActivityScope
import worklog5.com.myapplication.screens.main.contracts.MainContract
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(private val interactor: MainContract.Interactor = MainInteractor(),
                                        val dataManager: DataManager) : MainContract.presenter {

    private var view: MainContract.View? = null

    override fun onAttach(view: MainContract.View) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

}