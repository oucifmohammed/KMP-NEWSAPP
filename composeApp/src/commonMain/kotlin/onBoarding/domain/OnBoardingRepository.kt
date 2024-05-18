package onBoarding.domain

interface OnBoardingRepository {
    suspend fun saveOnBoardingEntry()
}