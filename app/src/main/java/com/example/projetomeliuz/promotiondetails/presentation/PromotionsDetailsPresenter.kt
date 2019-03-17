package com.example.projetomeliuz.promotiondetails.presentation

import com.example.projetomeliuz.promotiondetails.view.PromotionDetailsView
import com.example.projetomeliuz.promotions.data.StoreRepository

class PromotionsDetailsPresenter(
    private val view: PromotionDetailsView,
    private val storeRepository: StoreRepository
) {
    fun resume() {
        storeRepository.getStores()[0].let { store ->
            view.updateStoreInfo(store)
            view.showPromotionsDescription(store.promotionList)
        }
    }
}