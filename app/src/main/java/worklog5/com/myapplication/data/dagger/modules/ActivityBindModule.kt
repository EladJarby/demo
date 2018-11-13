package worklog5.com.myapplication.data.dagger.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import worklog5.com.myapplication.data.dagger.scopes.ActivityScope
import worklog5.com.myapplication.screens.main.MainActivity
import worklog5.com.myapplication.screens.main.MainModule

@Module
abstract class ActivityBindModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun mainActivity(): MainActivity
}