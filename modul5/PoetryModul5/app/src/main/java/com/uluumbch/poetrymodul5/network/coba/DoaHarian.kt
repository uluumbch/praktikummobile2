package com.uluumbch.poetrymodul5.network.coba


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DoaHarian(
    val `data`: List<Data>
)