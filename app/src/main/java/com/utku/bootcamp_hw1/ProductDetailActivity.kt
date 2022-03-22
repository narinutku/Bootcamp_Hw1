package com.utku.bootcamp_hw1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.utku.bootcamp_hw1.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityProductDetailBinding
    var totalPrice: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // val product=intent.getSerializableExtra("product") as Product
        val product = Util.product!!
        totalPrice = intent.getFloatExtra("totalPrice", 0f)
        val uri: Uri = Uri.parse("android.resource://${this.packageName}/" + product.pictureUrl)
        binding.imageProductDetail.setImageURI(null)
        binding.imageProductDetail.setImageURI(uri)
        binding.tvBrand.text = product.brand
        binding.tvPrice.text = "₺" + product.price.toString()
        binding.tvProductName.text = product.name
        binding.tvTotalPrice.text = "₺" + Util.toDecimalFormat(totalPrice)
        binding.tvDescription.text = product.description

        isVisible()

        binding.imBtnAddBasket.setOnClickListener {
            totalPrice += product.price


            binding.tvTotalPrice.text = Util.toDecimalFormat(totalPrice)
        }

        binding.btnBackToProduct.setOnClickListener {
            backToPreviousPage()
        }
    }

    override fun onBackPressed() {
        backToPreviousPage()
    }

    private fun backToPreviousPage() {
        val intent = Intent()

        intent.putExtra("totalPrice", totalPrice)

        setResult(RESULT_OK, intent)
        finish()
    }

//

    private fun isVisible() {
        if (!intent.getBooleanExtra("isLogin", false)) {
            binding.imBtnAddBasket.visibility = View.INVISIBLE
            binding.tvTotalPrice.visibility = View.INVISIBLE
            binding.imBtnBasket.visibility = View.INVISIBLE
        }
    }
}