package com.utku.bootcamp_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.utku.bootcamp_hw1.databinding.ActivityProductListBinding
import java.text.DecimalFormat

class ProductListActivity : AppCompatActivity() {
    lateinit var binding: ActivityProductListBinding
    var isLogin: Boolean = true
    var productList = ArrayList<Product>()
    var totalPrice = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        isLogin = intent.getBooleanExtra("login", true)
        isVisible(isLogin)

        createProductCategoryRecyclerView()

        createProductRecyclerView()

    }

    private fun createProductRecyclerView() {
        productList = Util.getProductList(0)

        val gridLayoutManager = GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
        binding.rcvProduct.layoutManager = gridLayoutManager
        binding.rcvProduct.adapter = ProductAdapter(
            this,
            productList,
            ::itemClickAddBasket, ::itemClickGoDetail, isLogin
        )
    }

    private fun createProductCategoryRecyclerView() {
        val lm = LinearLayoutManager(this)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        binding.rcvProductCategory.layoutManager = lm

        binding.rcvProductCategory.adapter =
            ProductCategoryAdapter(this, Util.getProductCategoryList(), ::itemClickCategory)
    }

    private fun isVisible(isLogin: Boolean) {

        if (!isLogin) {
            binding.tvTotalPrice.visibility = View.INVISIBLE
            binding.imBtnBasket.visibility = View.INVISIBLE

        }
    }

    private fun itemClickCategory(position: Int, categoryId: Int) {

        productList = Util.getProductList(categoryId)

        binding.rcvProduct.adapter = ProductAdapter(
            this, productList,
            ::itemClickAddBasket, ::itemClickGoDetail, isLogin
        )
        binding.rcvProductCategory.adapter!!.notifyDataSetChanged()

    }

    private fun itemClickAddBasket(position: Int) {

        totalPrice += productList[position].price
        updateTotalPrice(totalPrice)
    }

    private fun updateTotalPrice(price: Float) {

        //küsüratta iki basamak olmasına rağmen sepete toplanırken bazen virgülden sonra 6 basamak oldu bunu düzeltmek için kullandım
//        val df = DecimalFormat("#.##")
//        val roundoff = df.format(price)

        binding.tvTotalPrice.text = "₺" + Util.toDecimalFormat(price)
    }

    private fun itemClickGoDetail(position: Int) {
        val intent = Intent(this, ProductDetailActivity::class.java)
        // intent.putExtra("product", productList.get(position))
        Util.product = productList[position]
        intent.putExtra("totalPrice", totalPrice)
        intent.putExtra("isLogin", isLogin)
        resultLauncher.launch(intent)
    }

    private var resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ::productDetailResult
    )

    private fun productDetailResult(result: ActivityResult) {

        if (result.resultCode == RESULT_OK) {

            val returnValue = result.data?.getFloatExtra("totalPrice", 0f)
            if (returnValue != null) {
                updateTotalPrice(returnValue)
            }
        }
    }
}