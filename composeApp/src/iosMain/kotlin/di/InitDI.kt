package di

import org.koin.core.context.startKoin

fun initDi() {
    startKoin {
        modules(
            dataStoreModule,
            onBoardingModule,
            onBoardingViewModelModule,
            appModule,
            appViewModelModule
        )
    }
}