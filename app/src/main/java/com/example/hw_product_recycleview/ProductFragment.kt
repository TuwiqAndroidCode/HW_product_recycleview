package com.example.hw_product_recycleview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_product_recycleview.conistant.ProductInfo
import com.example.hw_product_recycleview.conistant.SmartPhoneWebsite
import com.example.hw_product_recycleview.databinding.FragmentProductBinding


class ProductFragment : Fragment() {
    private var _binding: FragmentProductBinding? = null
    private val binding get() = _binding!!
    private lateinit var phoneName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            phoneName = it.getString("name").toString()
            binding.phoneNameSmartphoneActivity.text = phoneName
            binding.phoneImageSmartPhoneActivity.setImageResource(it.getInt("imageId"))
            binding.phonePriceSmartPhoneActivity.text = it.getString("price")

        }

        // start intent to open Uri on browser
        binding.goToPhoneWebsite.setOnClickListener {
            val queryUrl: Uri = Uri.parse(getUri(phoneName))
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun getUri(phoneName: String?): String {

        return when (phoneName) {
            getString(R.string.Iphone_12_64GB) -> SmartPhoneWebsite.Iphone_12_64GB
            getString(R.string.Samsung_Galaxy_S21_Ultra) -> SmartPhoneWebsite.Samsung_Galaxy_S21_Ultra
            getString(R.string.Xiaomi_11T_Pro) -> SmartPhoneWebsite.Xiaomi_11T_Pro
            getString(R.string.Huawei_Y6p) -> SmartPhoneWebsite.Huawei_Y6p
            getString(R.string.Samsung_Galaxy_Z_Flip3) -> SmartPhoneWebsite.Samsung_Galaxy_Z_Flip3
            getString(R.string.Iphone_13) -> SmartPhoneWebsite.Iphone_13
            getString(R.string.Samsung_Galaxy_S20_FE) -> SmartPhoneWebsite.Samsung_Galaxy_S20_FE
            getString(R.string.Samsung_Galaxy_S21) -> SmartPhoneWebsite.Samsung_Galaxy_S21
            getString(R.string.OPPO_Reno_5_Pro) -> SmartPhoneWebsite.OPPO_Reno_5_Pro
            getString(R.string.Iphone_11) -> SmartPhoneWebsite.Iphone_11
            else -> "https://www.google.com/"
        }

    }
}