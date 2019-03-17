package com.example.projetomeliuz.checkout

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomeliuz.R
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        checkoutBT.setOnClickListener {
            Dialog(this).apply {
                setContentView(R.layout.checkout_dialog)
            }.show()
        }
    }
}
