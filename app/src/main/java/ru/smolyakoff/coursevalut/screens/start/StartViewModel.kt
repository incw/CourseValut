package ru.smolyakoff.coursevalut.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.smolyakoff.coursevalut.data.repository.Repository
import ru.smolyakoff.coursevalut.model.cash.Cash

class StartViewModel: ViewModel() {

    var repo = Repository()

    val moneyList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getCashResponse()
        }
    }

}