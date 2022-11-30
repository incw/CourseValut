package ru.smolyakoff.coursevalut.model.card

data class CardItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)