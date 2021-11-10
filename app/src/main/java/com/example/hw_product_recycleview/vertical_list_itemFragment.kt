package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.adapter.SmartPhoneAdapter
import com.example.hw_product_recycleview.databinding.ActivityMainBinding
import com.example.hw_product_recycleview.databinding.FragmentVerticalListItemBinding

class vertical_list_itemFragment : Fragment() {

    var binding: FragmentVerticalListItemBinding?=null

    //- onCreaate() the fragment instantiated and on Create State, (view not created yet)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

//- `onCreateView()`: This method is where you inflate the layout (connects the xml with activity)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding = FragmentVerticalListItemBinding.inflate(layoutInflater)
    val view= binding!!.root
    return view
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.RecyclerView.adapter = SmartPhoneAdapter(applicationContext)
        binding.RecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }




    }
