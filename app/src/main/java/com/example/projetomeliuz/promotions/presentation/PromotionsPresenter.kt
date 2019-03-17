package com.example.projetomeliuz.promotions.presentation

import com.example.projetomeliuz.promotions.data.StoreRepository
import com.example.projetomeliuz.promotions.view.PromotionsView

class PromotionsPresenter(
    private val view: PromotionsView,
    private val storeRepository: StoreRepository
) {
    fun resume() {
        storeRepository.getStores()
            .flatMap { store ->
                store.promotionList
            }.let { promotionList ->
                view.showPromotions(promotionList)
            }
    }
}