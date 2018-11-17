package worklog5.com.myapplication.screens.main.fragments.sub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import worklog5.com.myapplication.R
import worklog5.com.myapplication.screens.base.BaseFragment
import worklog5.com.myapplication.screens.main.fragments.sub.contracts.SubContract
import javax.inject.Inject

class SubFragment : BaseFragment(), SubContract.View {

    @Inject
    lateinit var presenter: SubContract.presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sub,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onAttach(this)
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }
}
