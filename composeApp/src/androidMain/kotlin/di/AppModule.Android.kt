package di

import app.presentation.AppViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

actual val appViewModelModule: Module = module {
    viewModel {
        AppViewModel(get())
    }
}