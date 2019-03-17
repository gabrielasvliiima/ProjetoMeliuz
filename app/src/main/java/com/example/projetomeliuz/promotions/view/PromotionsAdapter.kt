package com.example.projetomeliuz.promotions.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomeliuz.R
import com.example.projetomeliuz.promotions.model.Promotion
import kotlinx.android.synthetic.main.promotion_item_list.view.*

class PromotionsAdapter(
    private val promotionList: List<Promotion>,
    private val showPromotion: (Promotion) -> Unit
) : RecyclerView.Adapter<PromotionsAdapter.ViewHolder>() {

    class ViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {
        fun bindView(promotion: Promotion) {
            view.run {
                promotionIV.setImageResource(promotion.imageId)
                promotionTextTV.text = promotion.product
                promotionValueTV.text = "${promotion.value}%"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.promotion_item_list, parent, false))

    override fun getItemCount(): Int = promotionList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(promotionList[position])

        holder.itemView.setOnClickListener {
            showPromotion(promotionList[position])
        }
    }
}