package worklog5.com.myapplication.screens.base

interface BasePresenter<T> {
    fun onAttach(view: T)
    fun onDetach()
}