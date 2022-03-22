package com.utku.bootcamp_hw1

import android.content.Context
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rcv_product_category.view.*

class ProductCategoryViewHolder(
    itemView: View,
    itemClick: (position: Int,categoryId:Int) -> Unit,
    changeSelectedIndex: (Int) -> Unit
) : RecyclerView.ViewHolder(itemView) {


    var btnProductCategory: Button
     var categoryId=0

    init {

        btnProductCategory = itemView.findViewById(R.id.btnProductCategory)


        btnProductCategory.setOnClickListener {
            changeSelectedIndex(absoluteAdapterPosition)
            itemClick(
                absoluteAdapterPosition,categoryId)

        }
    }

    fun bindData(
        context: Context,
        productCategory: ProductCategory,
        isSelected: Boolean

    ) {
        categoryId=productCategory.categoryId
        btnProductCategory.text = productCategory.name
        if (isSelected) {
            btnProductCategory.setBackgroundResource(R.drawable.button_design_green)
            btnProductCategory.setTextColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorWhite
                )
            )

        } else {
            btnProductCategory.setBackgroundResource(R.drawable.input_design_white)
            btnProductCategory.setTextColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorBlack
                )
            )
        }

    }
}