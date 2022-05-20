package com.uluumbch.poetrymodul5.network.coba


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val arabic: String,
    val latin: String,
    val title: String,
    val translation: String
)