package di

import app.presentation.AppViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val appViewModelModule: Module = module {
    singleOf(::AppViewModel)
}