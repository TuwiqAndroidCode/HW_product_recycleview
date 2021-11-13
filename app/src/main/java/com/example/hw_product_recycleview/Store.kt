package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.adapter.SmartPhoneAdapter
import com.example.hw_product_recycleview.databinding.FragmentStoreBinding

class Store : Fragment() {

    var _binding: FragmentStoreBinding?=null
    val binding get() = _binding

    //- onCreaate() the fragment instantiated and on Create State, (view not created yet)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

//- `onCreateView()`: This method is where you inflate the layout (connects the xml with activity)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
    _binding = FragmentStoreBinding.inflate(layoutInflater,container,false)
    val view= binding!!.root
    return view
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding?.recyclerView?.adapter = context?.let { SmartPhoneAdapter(this, it) }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding=null   }
    }
