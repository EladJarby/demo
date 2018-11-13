package worklog5.com.myapplication.data.dagger.modules

import dagger.Module
import dagger.Provides
import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.local.LocalDataManager
import worklog5.com.myapplication.data.remote.RemoteDataManager
import javax.inject.Singleton

@Module
internal class DataManagerModule {
    @Provides
    fun provideRemoteDataManager(): RemoteDataManager {
        return RemoteDataManager()
    }

    @Provides
    @Singleton
    fun provideLocalDataManager(): LocalDataManager {
        return LocalDataManager()
    }

    @Provides
    @Singleton
    fun provideDataManager(remoteDataManager: RemoteDataManager, localDataManager: LocalDataManager): DataManager {
        return DataManager(remoteDataManager,localDataManager)
    }
}