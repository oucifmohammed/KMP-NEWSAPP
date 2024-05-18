package org.mohammedoucif.newsapp

import android.app.Application
import di.appModule
import di.appViewModelModule
import di.dataStoreModule
import di.onBoardingModule
import di.onBoardingViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@NewsApplication)
            modules(
                dataStoreModule,
                onBoardingModule,
                onBoardingViewModelModule,
                appModule,
                appViewModelModule
            )
        }
    }
}