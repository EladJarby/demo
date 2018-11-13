package worklog5.com.myapplication.screens.main.fragments.main

import dagger.Binds
import dagger.Module
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import worklog5.com.myapplication.screens.main.fragments.main.impl.MainFragmentInteractor
import worklog5.com.myapplication.screens.main.fragments.main.impl.MainFragmentPresenter

@Module
abstract class MainFragmentModule {

    @FragmentScope
    @Binds
    internal abstract fun mainFragmentContrantInteractor(interactor: MainFragmentInteractor): MainFragmentContract.interactor

    @FragmentScope
    @Binds
    internal abstract fun mainFragmentContractPresenter(presenter: MainFragmentPresenter): MainFragmentContract.presenter
}