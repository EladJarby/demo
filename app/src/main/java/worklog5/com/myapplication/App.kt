package worklog5.com.myapplication

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import worklog5.com.myapplication.data.dagger.AppComponent
import worklog5.com.myapplication.data.dagger.DaggerAppComponent

class App : DaggerApplication() {
    companion object {
        lateinit var appComponent: AppComponent
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder().application(this).build()
        return appComponent
    }

}