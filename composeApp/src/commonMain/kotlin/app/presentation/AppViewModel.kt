package app.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.domain.ReadIsAppEntryUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AppViewModel(
    private val readIsAppFirstEntry: ReadIsAppEntryUseCase
): ViewModel() {

    private val _isAppFirstEntry = MutableStateFlow<Boolean?>(null)
    val isAppFirstEntry = _isAppFirstEntry.asStateFlow()

    init {
        viewModelScope.launch {
            _isAppFirstEntry.value = readIsAppFirstEntry()
        }
    }
}