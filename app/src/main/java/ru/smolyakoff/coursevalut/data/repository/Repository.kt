package ru.smolyakoff.coursevalut.data.repository

import retrofit2.Response
import ru.smolyakoff.coursevalut.data.api.RetrofitInstance
import ru.smolyakoff.coursevalut.model.card.Card
import ru.smolyakoff.coursevalut.model.cash.Cash

class Repository {

    suspend fun getCashResponse():Response<Cash>{
        return RetrofitInstance.api.getCash()
    }

    suspend fun getCardResponse():Response<Card>{
        return RetrofitInstance.api.getCard()
    }

}