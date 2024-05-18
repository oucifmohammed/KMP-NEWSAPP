package di

import onBoarding.presentation.OnBoardingViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val onBoardingViewModelModule: Module = module {
    singleOf(::OnBoardingViewModel)
}