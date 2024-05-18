package app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import onBoarding.ui.OnBoardingScreen
import androidx.lifecycle.viewmodel.compose.viewModel
import app.presentation.AppViewModel
import home.ui.HomeScreen
import onBoarding.presentation.OnBoardingViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.currentKoinScope
import theme.NewsAppTheme

@Composable
@Preview
fun App() {
    NewsAppTheme {
        KoinContext {
            val viewModel = koinViewModel<OnBoardingViewModel>()
            val appViewModel = koinViewModel<AppViewModel>()

            Box(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxSize()
            ) {
                val isAppFirstEntryState = appViewModel.isAppFirstEntry.collectAsState()

                isAppFirstEntryState.value?.let { isAppFirstEntry ->
                    if(isAppFirstEntry)
                        HomeScreen()
                    else
                        OnBoardingScreen(viewModel.pages, viewModel::onEvent)
                }
            }
        }
    }
}

@Composable
inline fun <reified T: ViewModel> koinViewModel(): T {
    val scope = currentKoinScope()

    return viewModel {
        scope.get<T>()
    }
}