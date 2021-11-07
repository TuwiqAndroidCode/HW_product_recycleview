package com.example.hw_product_recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.hw_product_recycleview.adapter.SmartPhoneAdapter
import com.example.hw_product_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // launch the recyclerView
        activateGridRecyclerView()

    }


    /**
     * function to activate the recyclerView
     */

    private fun activateGridRecyclerView() {
        binding.gridRecyclerView.adapter = SmartPhoneAdapter(applicationContext)
        binding.gridRecyclerView.setHasFixedSize(true)
    }
}