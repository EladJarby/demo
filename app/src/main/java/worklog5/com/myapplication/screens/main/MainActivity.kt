package worklog5.com.myapplication.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import worklog5.com.myapplication.R
import worklog5.com.myapplication.screens.base.BaseActivity
import worklog5.com.myapplication.screens.main.contracts.MainContract
import worklog5.com.myapplication.screens.main.fragments.main.MainFragment
import worklog5.com.myapplication.screens.main.fragments.sub.SubFragment
import javax.inject.Inject
import kotlin.reflect.KClass

class MainActivity : BaseActivity(),MainContract.View {

    @Inject
    lateinit var presenter: MainContract.presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)

        supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment_container, MainFragment::class.java.newInstance(),null)
                .commit()
    }


    override fun replaceFragment() {
        supportFragmentManager.beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out)
                .replace(R.id.main_fragment_container, SubFragment::class.java.newInstance(), "APP_INFO_FRAGMENT").addToBackStack("APP_INFO_FRAGMENT")
                .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }
}
