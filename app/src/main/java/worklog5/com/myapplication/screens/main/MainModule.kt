package worklog5.com.myapplication.screens.main

import dagger.Binds
import dagger.Module
import worklog5.com.myapplication.data.dagger.scopes.ActivityScope
import worklog5.com.myapplication.screens.main.contracts.MainContract
import worklog5.com.myapplication.screens.main.impl.MainInteractor
import worklog5.com.myapplication.screens.main.impl.MainPresenter

@Module
abstract class MainModule {

    @ActivityScope
    @Binds
    internal abstract fun mainContractPresenter(presenter: MainPresenter): MainContract.presenter

    @ActivityScope
    @Binds
    internal abstract fun mainContractInteractor(interactor: MainInteractor): MainContract.Interactor
}