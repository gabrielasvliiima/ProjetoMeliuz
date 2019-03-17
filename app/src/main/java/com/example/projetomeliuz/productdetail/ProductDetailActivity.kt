package com.example.projetomeliuz.productdetail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetomeliuz.R
import com.example.projetomeliuz.checkout.CheckoutActivity
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        flavoursRV.run {
            setHasFixedSize(true)
            adapter = FlavoursAdapter(listOf("Chocolate", "Morango", "Cookie"), ::goToCheckout)
            layoutManager = LinearLayoutManager(this@ProductDetailActivity)
        }
    }

    private fun goToCheckout() {
        startActivity(Intent(this, CheckoutActivity::class.java))
    }
}
