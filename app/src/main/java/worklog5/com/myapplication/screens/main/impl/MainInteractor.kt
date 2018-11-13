package worklog5.com.myapplication.screens.main.impl

import worklog5.com.myapplication.data.dagger.scopes.ActivityScope
import worklog5.com.myapplication.screens.main.contracts.MainContract
import javax.inject.Inject

@ActivityScope
class MainInteractor @Inject constructor() : MainContract.Interactor