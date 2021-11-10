package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class smart_phone_ActivityFragment : Fragment() {
    private lateinit var Phone: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            Phone = it.getString(phone).toString()
            recyclerView.adapter = smart_phone_ActivityFragment(Phone, requireContext())
        }

    }
}


