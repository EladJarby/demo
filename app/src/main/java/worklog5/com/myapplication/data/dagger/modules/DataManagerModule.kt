package worklog5.com.myapplication.data.dagger.modules

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import worklog5.com.myapplication.constant.Constants
import worklog5.com.myapplication.data.DataManager
import worklog5.com.myapplication.data.local.LocalDataManager
import worklog5.com.myapplication.data.remote.Api
import worklog5.com.myapplication.data.remote.RemoteDataManager
import javax.inject.Singleton

@Module
internal class DataManagerModule {
    @Provides
    fun provideRemoteDataManager(api: Api): RemoteDataManager {
        return RemoteDataManager(api)
    }

    @Provides
    @Singleton
    fun provideLocalDataManager(): LocalDataManager {
        return LocalDataManager()
    }

    @Provides
    @Singleton
    fun provideDataManager(remoteDataManager: RemoteDataManager, localDataManager: LocalDataManager): DataManager {
        return DataManager(remoteDataManager, localDataManager)
    }

    @Provides
    fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Constants.JSON_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides
    fun api(): Api {
        return provideRetrofitInstance().create<Api>(Api::class.java)
    }
}