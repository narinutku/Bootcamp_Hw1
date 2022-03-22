package com.utku.bootcamp_hw1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    private val context: Context,
    var list: ArrayList<Product>,
    private val itemClickAddBasket: (position: Int) -> Unit,
    private val itemClickGoDetail: (position: Int) -> Unit,
private val isLogin:Boolean) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rcv_product, parent, false)

        return ProductViewHolder(view, itemClickAddBasket,itemClickGoDetail,isLogin)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindData(context, list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}