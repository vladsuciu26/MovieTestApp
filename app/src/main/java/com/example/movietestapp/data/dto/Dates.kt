package com.example.movietestapp.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dates(
    @SerialName("maximum")
    val maximum: String? = null,

    @SerialName("minimum")
    val minimum: String? = null
)