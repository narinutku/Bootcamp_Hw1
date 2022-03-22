package com.utku.bootcamp_hw1

import java.io.Serializable

class Product(
    var pictureUrl: String,
    var brand: String,
    var name: String,
    var price: Float,
    var description: String,
    var productCategory: ProductCategory
) :Serializable {
}