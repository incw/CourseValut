package ru.smolyakoff.coursevalut.data.api

import retrofit2.Response
import retrofit2.http.GET
import ru.smolyakoff.coursevalut.model.card.Card
import ru.smolyakoff.coursevalut.model.card.CardItem
import ru.smolyakoff.coursevalut.model.cash.Cash
import ru.smolyakoff.coursevalut.model.cash.CashItem

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCash():Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11 ")
    suspend fun getCard():Response<Card>

}