package worklog5.com.myapplication.screens.main.fragments.sub.impl

import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.sub.contracts.SubContract
import javax.inject.Inject

@FragmentScope
class SubInteractor @Inject constructor() : SubContract.interactor {
}