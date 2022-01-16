package net.ahrefs.ahrefschallange.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.ahrefs.ahrefschallange.data.entities.Result

open class BaseViewModel : ViewModel() {

    val dataLoading = MutableLiveData(false)

    var error = MutableLiveData<Result.BaseError>()
}