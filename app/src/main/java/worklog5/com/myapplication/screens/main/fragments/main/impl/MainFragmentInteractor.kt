package worklog5.com.myapplication.screens.main.fragments.main.impl

import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import javax.inject.Inject


@FragmentScope
class MainFragmentInteractor @Inject constructor() : MainFragmentContract.interactor