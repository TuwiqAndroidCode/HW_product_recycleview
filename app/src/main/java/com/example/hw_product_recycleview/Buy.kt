package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.databinding.FragmentBuyBinding


class Buy : Fragment() {

    private var _binding: FragmentBuyBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
_binding = FragmentBuyBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            binding.phoneNameSmartphoneActivity.text = it.getString("phoneInfo").toString()
            binding.phoneImageSmartPhoneActivity.setImageResource(it.getInt("phoneImage"))

        }

    }

    override fun onDestroy() {
        super.onDestroy()
         _binding=null
    }
}


