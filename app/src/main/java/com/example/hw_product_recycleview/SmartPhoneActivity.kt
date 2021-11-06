package com.example.hw_product_recycleview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_product_recycleview.conistant.ProductInfo
import com.example.hw_product_recycleview.conistant.SmartPhoneWebsite
import com.example.hw_product_recycleview.databinding.ActivitySmartPhoneBinding

class SmartPhoneActivity : AppCompatActivity() {
private lateinit var binding: ActivitySmartPhoneBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.phoneNameSmartphoneActivity.text = intent.extras?.getString(ProductInfo.PHONE_NAME)
        println(intent.extras?.getString(ProductInfo.PHONE_NAME))
        binding.phoneImageSmartPhoneActivity.setImageResource(intent.extras?.getInt(ProductInfo.PHONE_IMAGE)!!)
        binding.phonePriceSmartPhoneActivity.text =
        intent.extras?.getString(ProductInfo.PHONE_PRICE)


        binding.goToPhoneWebsite.setOnClickListener {
        val queryUrl: Uri = Uri.parse( getUri(intent.extras?.getString(ProductInfo.PHONE_NAME)))
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)

        }
  }

private fun getUri(phoneName: String?): String {

        return when (phoneName) {
        getString(R.string.Iphone_12_64GB) -> SmartPhoneWebsite.Iphone_12_64GB
        getString(R.string.Samsung_Galaxy_S21_Ultra) -> SmartPhoneWebsite.Samsung_Galaxy_S21_Ultra
        getString(R.string.Xiaomi_11T_Pro) -> SmartPhoneWebsite.Xiaomi_11T_Pro
        getString(R.string.Huawei_Y6p) -> SmartPhoneWebsite.Huawei_Y6p
        getString(R.string.Samsung_Galaxy_Z_Flip3) -> SmartPhoneWebsite.Samsung_Galaxy_Z_Flip3
        getString(R.string.Iphone_13) -> SmartPhoneWebsite.Iphone_13
            else -> "https://www.google.com/"
        }
     }
  }