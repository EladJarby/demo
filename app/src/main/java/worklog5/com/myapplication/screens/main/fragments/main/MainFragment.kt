package worklog5.com.myapplication.screens.main.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import worklog5.com.myapplication.R
import worklog5.com.myapplication.data.dagger.scopes.FragmentScope
import worklog5.com.myapplication.screens.base.BaseFragment
import worklog5.com.myapplication.screens.main.MainActivity
import worklog5.com.myapplication.screens.main.fragments.main.contracts.MainFragmentContract
import worklog5.com.myapplication.screens.main.fragments.sub.SubFragment
import javax.inject.Inject

class MainFragment : BaseFragment(), MainFragmentContract.View {

    @Inject
    lateinit var presenter: MainFragmentContract.presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).replaceFragment()
        presenter.onAttach(this)
    }

    override fun setText(toString: String) {
        main_text.text = toString
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }
}
