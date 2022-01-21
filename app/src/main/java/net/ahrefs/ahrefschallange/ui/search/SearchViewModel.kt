package net.ahrefs.ahrefschallange.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.ahrefs.ahrefschallange.base.BaseViewModel
import net.ahrefs.ahrefschallange.data.network.BaseRepository
import javax.inject.Inject
import net.ahrefs.ahrefschallange.data.entities.Result

@HiltViewModel
class SearchViewModel @Inject constructor(private val repo: BaseRepository) : BaseViewModel() {

    var searchQuery = MutableLiveData("")
    val resultsList = MutableLiveData<List<String>>(emptyList())

    fun getData(word: String?) {
        viewModelScope.launch {
            dataLoading.value = true
            when (val response = repo.getSearchResults(word)) {
                is Result.Successful -> {
                    resultsList.value = response.data.map { it.phrase }
                }
                is Result.BaseError -> error.value = response
            }
            dataLoading.value = false
        }
    }
}