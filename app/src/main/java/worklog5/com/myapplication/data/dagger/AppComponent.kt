package worklog5.com.myapplication.data.dagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import worklog5.com.myapplication.App
import worklog5.com.myapplication.data.dagger.modules.ActivityBindModule
import worklog5.com.myapplication.data.dagger.modules.DataManagerModule
import worklog5.com.myapplication.data.dagger.modules.FragmentBindModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,ActivityBindModule::class,FragmentBindModule::class,DataManagerModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}