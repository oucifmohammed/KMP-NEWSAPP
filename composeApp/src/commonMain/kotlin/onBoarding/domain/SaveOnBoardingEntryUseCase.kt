package onBoarding.domain

class SaveOnBoardingEntryUseCase(
    private val repository: OnBoardingRepository
) {
    suspend operator fun invoke() = repository.saveOnBoardingEntry()
}