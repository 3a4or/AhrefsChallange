package net.ahrefs.ahrefschallange.ui.search

import dagger.hilt.android.lifecycle.HiltViewModel
import net.ahrefs.ahrefschallange.base.BaseViewModel
import net.ahrefs.ahrefschallange.data.network.BaseRepository
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val repo: BaseRepository) : BaseViewModel() {

}