package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.SmartPhone


/**
 * An object to generate a list of smartphones
 */
object DataSource {

    val smartPhone: List<SmartPhone> = listOf(
        SmartPhone(
            R.drawable.iphone_12,
            R.string.Iphone_12_64GB,
            "4500 SR",
            true,
            5

        ),
        SmartPhone(
            R.drawable.samsung_galaxy_uitra,
            R.string.Samsung_Galaxy_S21_Ultra,
            "4500 SR",
            false,
            5
        ),
        SmartPhone(
            R.drawable.xiaomi_pro,
            R.string.Xiaomi_11T_Pro,
            "2000 SR",
            true,
            0
        ),
        SmartPhone(
            R.drawable.huawei_yp,
            R.string.Huawei_Y6p,
            "500 SR",
            false,
            0
        ),
        SmartPhone(
            R.drawable.samsung_galaxy_z_flip,
            R.string.Samsung_Galaxy_Z_Flip3,
            "5000 SR",
            true,
            70
        ),
        SmartPhone(
        R.drawable.iphone_13,
        R.string.Iphone_13,
           "6000 SR",
           true,
           36
        ),
        SmartPhone(R.drawable.samsung_galaxy_s20_fe,
        R.string.Samsung_Galaxy_S20_FE,
        "1900 SR",
        false,
        7
        ),
        SmartPhone(R.drawable.samsung_galaxy_s21_,
            R.string.Samsung_Galaxy_S21,
            "3500 SR",
            true,
            5
        ),
        SmartPhone(R.drawable.oppo_5,
            R.string.OPPO_Reno_5_Pro,
            "2400 SR",
            false,
            0
        ),
        SmartPhone(R.drawable.iphone_11,
        R.string.Iphone_11,
        "2900 SR",
            true,
            29
            )


    )
}