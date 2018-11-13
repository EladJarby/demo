package worklog5.com.myapplication.data

import worklog5.com.myapplication.data.local.LocalDataManager
import worklog5.com.myapplication.data.remote.RemoteDataManager

data class DataManager(val remoteDataManager: RemoteDataManager, val localDataManager: LocalDataManager)