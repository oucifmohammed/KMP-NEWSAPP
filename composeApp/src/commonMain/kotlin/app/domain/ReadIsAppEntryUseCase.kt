package app.domain

class ReadIsAppEntryUseCase(
    private val repository: AppRepository
) {
    suspend operator fun invoke(): Boolean = repository.readIsAppFirstEntry()
}