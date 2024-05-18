package onBoarding.presentation

sealed class OnBoardingEvent {

    data object OnGetStartedButtonClickEvent: OnBoardingEvent()
}