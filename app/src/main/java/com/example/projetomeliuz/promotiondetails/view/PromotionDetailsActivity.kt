package com.example.projetomeliuz.promotiondetails.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetomeliuz.R
import com.example.projetomeliuz.productdetail.ProductDetailActivity
import com.example.projetomeliuz.promotiondetails.presentation.PromotionsDetailsPresenter
import com.example.projetomeliuz.promotions.data.StoreRepository
import com.example.projetomeliuz.promotions.model.Promotion
import com.example.projetomeliuz.stores.Store
import com.example.projetomeliuz.utils.EXTRA_PROMOTION
import kotlinx.android.synthetic.main.activity_promotion_details.*

class PromotionDetailsActivity : AppCompatActivity(), PromotionDetailsView {

    private val promotionsList: MutableList<Promotion> = mutableListOf()
    private val promotionsDescriptionAdapter = PromotionsDescriptionAdapter(promotionsList) {
        goToProductDescription()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promotion_details)

        (intent?.extras?.get(EXTRA_PROMOTION) as Promotion?)?.let { promotion ->
            detailsTitleTV.text = promotion.place
        }

        promotionDescriptionsRV.run {
            setHasFixedSize(true)
            adapter = promotionsDescriptionAdapter
            layoutManager = LinearLayoutManager(this@PromotionDetailsActivity)
        }

        PromotionsDetailsPresenter(this, StoreRepository()).resume()
    }

    override fun showPromotionsDescription(promotions: List<Promotion>) {
        promotionsList.clear()
        promotionsList.addAll(promotions)
        promotionsDescriptionAdapter.notifyDataSetChanged()
    }

    override fun updateStoreInfo(store: Store) {
        detailsImageIV.setImageResource(store.imageId)
        globalPromotionValueTV.text = "${store.globalPromotion}%"
    }

    override fun goToProductDescription() {
        startActivity(Intent(this, ProductDetailActivity::class.java))
    }

}
