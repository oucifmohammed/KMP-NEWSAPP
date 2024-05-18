package di

import app.domain.AppRepository
import app.domain.ReadIsAppEntryUseCase
import app.repository.AppRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule = module {
    factory<AppRepository> {
        AppRepositoryImpl(get())
    }

    factory {
        ReadIsAppEntryUseCase(get())
    }
}

expect val appViewModelModule: Module