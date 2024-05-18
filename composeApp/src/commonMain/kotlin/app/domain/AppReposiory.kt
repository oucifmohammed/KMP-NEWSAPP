package app.domain

interface AppRepository {
    suspend fun readIsAppFirstEntry(): Boolean
}