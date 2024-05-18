package di

import onBoarding.presentation.OnBoardingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


actual val onBoardingViewModelModule: Module = module {
    viewModel {
        OnBoardingViewModel(get())
    }
}