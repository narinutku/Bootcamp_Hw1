package com.utku.bootcamp_hw1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class ProductCategoryAdapter(val context : Context, var list : ArrayList<ProductCategory>, val itemClick : (position : Int,categoryId:Int)->Unit) : RecyclerView.Adapter<ProductCategoryViewHolder> () {
    var selectedPosition:Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCategoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rcv_product_category, parent, false)

        return ProductCategoryViewHolder(view, itemClick,::changeIndex)
    }

    override fun onBindViewHolder(holder: ProductCategoryViewHolder, position: Int) {

        holder.bindData(context, list.get(position),selectedPosition==position)

    }

    override fun getItemCount(): Int {
      return list.size
    }
    private fun changeIndex(index:Int){
        selectedPosition=index
    }
}