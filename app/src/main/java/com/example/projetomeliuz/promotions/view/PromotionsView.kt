package com.example.projetomeliuz.promotions.view

import com.example.projetomeliuz.promotions.model.Promotion

interface PromotionsView {

    fun showPromotions(promotions: List<Promotion>)
    fun goToPromotion(promotion: Promotion)
}