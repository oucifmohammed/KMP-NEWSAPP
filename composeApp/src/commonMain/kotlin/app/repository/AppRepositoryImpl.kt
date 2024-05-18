package app.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import app.domain.AppRepository
import kotlinx.coroutines.flow.first

class AppRepositoryImpl(
    private val dataStore: DataStore<Preferences>
): AppRepository {

    override suspend fun readIsAppFirstEntry(): Boolean {
        return dataStore.data.first()[booleanPreferencesKey("isFirstTimeAppEntry")] ?: false
    }
}