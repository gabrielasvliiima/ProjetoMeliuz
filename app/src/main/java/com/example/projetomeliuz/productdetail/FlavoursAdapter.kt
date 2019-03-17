package com.example.projetomeliuz.productdetail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomeliuz.R
import kotlinx.android.synthetic.main.flavour_item_list.view.*

class FlavoursAdapter(
    private val flavourList: List<String>,
    private val callback: () -> Unit
) : RecyclerView.Adapter<FlavoursAdapter.ViewHolder>() {

    class ViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {
        fun bindView(flavour: String) {
            view.run {
                flavourTextTV.text = flavour
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.flavour_item_list, parent, false))

    override fun getItemCount(): Int = flavourList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(flavourList[position])

        holder.itemView.setOnClickListener {
            callback()
        }
    }
}