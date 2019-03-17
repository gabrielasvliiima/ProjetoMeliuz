package com.example.projetomeliuz.advertisement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomeliuz.R
import com.example.projetomeliuz.promotions.view.PromotionsActivity
import kotlinx.android.synthetic.main.activity_advertisement.*

class AdvertisementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertisement)

        enterAdvertisementBT.setOnClickListener {
            startActivity(Intent(this, PromotionsActivity::class.java))
        }
    }
}
