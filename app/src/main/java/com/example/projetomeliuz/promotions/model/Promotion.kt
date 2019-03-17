package com.example.projetomeliuz.promotions.model

import java.io.Serializable

data class Promotion(
    val imageId: Int,
    val product: String,
    val description: String,
    val value: Float,
    val place: String
) : Serializable