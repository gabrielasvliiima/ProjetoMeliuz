package com.example.projetomeliuz.promotiondetails.view

import com.example.projetomeliuz.promotions.model.Promotion
import com.example.projetomeliuz.stores.Store

interface PromotionDetailsView {
    fun showPromotionsDescription(promotions: List<Promotion>)
    fun updateStoreInfo(store: Store)
    fun goToProductDescription()
}