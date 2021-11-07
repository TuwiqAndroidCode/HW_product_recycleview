package com.example.hw_product_recycleview

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_product_recycleview.databinding.ActivityProductdetailsBinding
import com.example.hw_product_recycleview.objects.Detail

class Productdetails : AppCompatActivity() {
    private lateinit var binding: ActivityProductdetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.phoneName.text = intent.extras?.getString(Detail.PhoneName)
        binding.Phonepic.setImageResource(intent.extras?.getInt(Detail.PhoneImage)!!)




    }
}