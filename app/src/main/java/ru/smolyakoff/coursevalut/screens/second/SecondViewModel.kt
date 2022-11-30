package ru.smolyakoff.coursevalut.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.smolyakoff.coursevalut.data.repository.Repository
import ru.smolyakoff.coursevalut.model.card.Card
import ru.smolyakoff.coursevalut.model.cash.Cash

class SecondViewModel:ViewModel() {

    var repo = Repository()

    val moneyList: MutableLiveData<Response<Card>> = MutableLiveData()

    fun getCardMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getCardResponse()
        }
    }
}