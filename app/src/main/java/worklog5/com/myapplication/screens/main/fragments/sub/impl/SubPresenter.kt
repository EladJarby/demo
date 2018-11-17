package worklog5.com.myapplication.screens.main.fragments.sub.impl

import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.sub.contracts.SubContract
import javax.inject.Inject

@FragmentScope
class SubPresenter @Inject constructor(val interactor: SubContract.interactor = SubInteractor(),
                                       val dataManager: DataManager) : SubContract.presenter {
    private var view: SubContract.View? = null

    override fun onAttach(view: SubContract.View) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

}