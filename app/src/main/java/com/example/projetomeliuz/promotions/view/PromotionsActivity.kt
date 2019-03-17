package com.example.projetomeliuz.promotions.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetomeliuz.R
import com.example.projetomeliuz.promotiondetails.view.PromotionDetailsActivity
import com.example.projetomeliuz.promotions.data.StoreRepository
import com.example.projetomeliuz.promotions.model.Promotion
import com.example.projetomeliuz.promotions.presentation.PromotionsPresenter
import com.example.projetomeliuz.utils.EXTRA_PROMOTION
import kotlinx.android.synthetic.main.activity_promotions.*

class PromotionsActivity : AppCompatActivity(), PromotionsView {

    private val promotionsList = mutableListOf<Promotion>()
    private val promotionsAdapter = PromotionsAdapter(promotionsList, this::goToPromotion)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promotions)

        promotionsRV.run {
            setHasFixedSize(true)
            adapter = promotionsAdapter
            layoutManager = LinearLayoutManager(this@PromotionsActivity)
        }

        PromotionsPresenter(this, StoreRepository()).resume()
    }

    override fun showPromotions(promotions: List<Promotion>) {
        promotionsList.clear()
        promotionsList.addAll(promotions)
        promotionsAdapter.notifyDataSetChanged()
    }

    override fun goToPromotion(promotion: Promotion) {
        Intent(this, PromotionDetailsActivity::class.java).apply {
            putExtra(EXTRA_PROMOTION, promotion)
        }.let { intent ->
            startActivity(intent)
        }
    }
}
