package com.example.hw_product_recycleview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SmartPhone(
    @DrawableRes val productImage: Int,
    @StringRes val productName: Int,
    val productPrice: String,
    val isVip: Boolean,
    val productQuantity: Int
)
