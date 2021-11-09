package com.example.hw_product_recycleview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_product_recycleview.adapter.SmartPhoneAdapter
import com.example.hw_product_recycleview.databinding.FragmentProductsListBinding


class ProductsListFragment : Fragment() {
    // this variable for receiving values but no accessible fro reading value from it
    private var _binding: FragmentProductsListBinding? = null
    // this variable for getting the value of _binding variable
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductsListBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.gridRecyclerView.adapter = SmartPhoneAdapter(this.context)
        binding.gridRecyclerView.setHasFixedSize(true)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
