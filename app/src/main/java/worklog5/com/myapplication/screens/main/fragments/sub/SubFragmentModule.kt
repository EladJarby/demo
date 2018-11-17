package worklog5.com.myapplication.screens.main.fragments.sub

import dagger.Binds
import dagger.Module
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.sub.contracts.SubContract
import worklog5.com.myapplication.screens.main.fragments.sub.impl.SubInteractor
import worklog5.com.myapplication.screens.main.fragments.sub.impl.SubPresenter

@Module
abstract class SubFragmentModule {

    @FragmentScope
    @Binds
    internal abstract fun subFragmentContrantInteractor(interactor: SubInteractor): SubContract.interactor

    @FragmentScope
    @Binds
    internal abstract fun subFragmentContractPresenter(presenter: SubPresenter): SubContract.presenter
}