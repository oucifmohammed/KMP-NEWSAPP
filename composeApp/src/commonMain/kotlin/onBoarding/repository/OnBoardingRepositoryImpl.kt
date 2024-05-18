package onBoarding.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import onBoarding.domain.OnBoardingRepository

class OnBoardingRepositoryImpl(
    private val dataStore: DataStore<Preferences>
): OnBoardingRepository {

    private val isFirstTimeEntry = booleanPreferencesKey("isFirstTimeAppEntry")

    override suspend fun saveOnBoardingEntry() {
        dataStore.edit {  preferences ->
            preferences[isFirstTimeEntry] = true
        }
    }
}