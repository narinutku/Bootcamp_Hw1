package com.utku.bootcamp_hw1

import android.content.Context
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rcv_product.view.*
import kotlinx.android.synthetic.main.rcv_product_category.view.*


class ProductViewHolder(
    itemView: View,
    itemClickAddBasket: (position: Int) -> Unit,
    itemClickGoDetail: (position: Int) -> Unit,isLogin:Boolean
) : RecyclerView.ViewHolder(itemView) {
    var tvPrice: TextView
    var tvBrand: TextView
    var tvProduct: TextView
    var imageProduct: ImageView
    var imBtnAddBasket:ImageButton


    init {


        tvPrice = itemView.findViewById(R.id.tvPrice)
        tvBrand = itemView.findViewById(R.id.tvBrand)
        tvProduct = itemView.findViewById(R.id.tvProductName)
        imageProduct = itemView.findViewById(R.id.imageProduct)
        imBtnAddBasket=itemView.findViewById(R.id.imBtnAddBasket)
        if (!isLogin){
            imBtnAddBasket.visibility=View.INVISIBLE
        }
        imBtnAddBasket.setOnClickListener {
            itemClickAddBasket(absoluteAdapterPosition)
        }
        imageProduct.setOnClickListener {
            itemClickGoDetail(absoluteAdapterPosition)
        }

    }
    fun bindData(context: Context,product: Product){
        itemView.tvBrand.text=product.brand
        itemView.tvPrice.text="₺${product.price.toString()}"
        itemView.tvProductName.text=product.name

        val uri: Uri = Uri.parse("android.resource://${context.packageName}/"+product.pictureUrl)
        itemView.imageProduct.setImageURI(null)
        itemView.imageProduct.setImageURI(uri)
    }
}