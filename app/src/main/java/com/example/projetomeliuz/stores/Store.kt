package com.example.projetomeliuz.stores

import com.example.projetomeliuz.promotions.model.Promotion

data class Store(
    val name: String,
    val promotionList: List<Promotion>,
    val imageId: Int,
    val globalPromotion: Int
)