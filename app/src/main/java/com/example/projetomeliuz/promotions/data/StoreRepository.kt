package com.example.projetomeliuz.promotions.data

import com.example.projetomeliuz.R
import com.example.projetomeliuz.promotions.model.Promotion
import com.example.projetomeliuz.stores.Store

class StoreRepository {
    fun getStores(): List<Store> =
        listOf(
            Store(
                "Verdemar",
                listOf(
                    Promotion(
                        R.drawable.kibon_logo_cartaxi,
                        "Sorvete Kibon",
                        "20% de cashback produtos Kibon",
                        65F,
                        "Verdemar"
                    ),
                    Promotion(
                        R.drawable.tia_ju,
                        "Arroz Tia Ju",
                        "5% de cashback produto Yellow",
                        10.5F,
                        "Verdemar"
                    ),
                    Promotion(
                        R.drawable.belive,
                        "Biscoito Belive",
                        "8% de desconto no Biscoito Belive",
                        8F,
                        "Verdemar"
                    ),
                    Promotion(
                        R.drawable.yellow_alecrim,
                        "Yellow Alegrim ",
                        "5% de cashback produto Yellow",
                        1.5F,
                        "Verdemar"
                    ),
                    Promotion(
                        R.drawable.aipim,
                        "Aipim Chipe",
                        "7% de cashback produto  Aipim Chipe",
                        1.5F,
                        "Verdemar"
                    )
                ),
                R.drawable.verdemar_w,
                10
            )
        )
}