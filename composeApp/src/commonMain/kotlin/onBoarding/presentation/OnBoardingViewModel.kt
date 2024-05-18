package onBoarding.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import newsapp.composeapp.generated.resources.Res
import newsapp.composeapp.generated.resources.first_onboarding_desc
import newsapp.composeapp.generated.resources.first_onboarding_title
import newsapp.composeapp.generated.resources.onboarding1
import newsapp.composeapp.generated.resources.onboarding2
import newsapp.composeapp.generated.resources.onboarding3
import newsapp.composeapp.generated.resources.second_onboarding_desc
import newsapp.composeapp.generated.resources.second_onboarding_title
import newsapp.composeapp.generated.resources.third_onboarding_desc
import newsapp.composeapp.generated.resources.third_onboarding_title
import onBoarding.domain.SaveOnBoardingEntryUseCase
import org.jetbrains.compose.resources.ExperimentalResourceApi

class OnBoardingViewModel(
    private val saveOnBoardingEntry: SaveOnBoardingEntryUseCase
): ViewModel() {

    @OptIn(ExperimentalResourceApi::class)
    val pages = listOf(
        Page(
            title = Res.string.first_onboarding_title,
            description = Res.string.first_onboarding_desc,
            image = Res.drawable.onboarding1
        ),
        Page(
            title = Res.string.second_onboarding_title,
            description = Res.string.second_onboarding_desc,
            image = Res.drawable.onboarding2
        ),
        Page(
            title = Res.string.third_onboarding_title,
            description = Res.string.third_onboarding_desc,
            image = Res.drawable.onboarding3
        )
    )

    fun onEvent(event: OnBoardingEvent) {
        when(event) {
            OnBoardingEvent.OnGetStartedButtonClickEvent -> {
                GetStartedButtonClickEvent()
            }
        }
    }

    private fun GetStartedButtonClickEvent() {
        viewModelScope.launch {
            println("HELLO, GET STARTED BUTTON CLICKED VIEW-MODEL")
            saveOnBoardingEntry()
        }
    }
}