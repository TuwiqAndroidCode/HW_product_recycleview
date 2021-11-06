package com.example.hw_product_recycleview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_product_recycleview.databinding.ActivityProductdetailsBinding

class Productdetails : AppCompatActivity() {
    private lateinit var binding: ActivityProductdetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}