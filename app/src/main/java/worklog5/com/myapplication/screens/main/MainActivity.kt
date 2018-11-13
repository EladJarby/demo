package worklog5.com.myapplication.screens.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import worklog5.com.myapplication.R
import worklog5.com.myapplication.screens.base.BaseActivity
import worklog5.com.myapplication.screens.main.contracts.MainContract
import worklog5.com.myapplication.screens.main.fragments.main.MainFragment
import javax.inject.Inject

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

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }
}
