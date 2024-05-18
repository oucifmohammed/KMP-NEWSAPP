package di

import onBoarding.repository.OnBoardingRepositoryImpl
import onBoarding.domain.OnBoardingRepository
import onBoarding.domain.SaveOnBoardingEntryUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val onBoardingModule = module {
    factory<OnBoardingRepository> {
        OnBoardingRepositoryImpl(get())
    }

    factory {
        SaveOnBoardingEntryUseCase(get())
    }
}

expect val onBoardingViewModelModule: Module