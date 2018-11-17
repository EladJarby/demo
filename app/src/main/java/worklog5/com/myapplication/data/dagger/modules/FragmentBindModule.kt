package worklog5.com.myapplication.data.dagger.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.main.fragments.main.MainFragment
import worklog5.com.myapplication.screens.main.fragments.main.MainFragmentModule
import worklog5.com.myapplication.screens.main.fragments.sub.SubFragment
import worklog5.com.myapplication.screens.main.fragments.sub.SubFragmentModule

@Module
abstract class FragmentBindModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    internal abstract fun mainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [SubFragmentModule::class])
    internal abstract fun subFragment(): SubFragment
}