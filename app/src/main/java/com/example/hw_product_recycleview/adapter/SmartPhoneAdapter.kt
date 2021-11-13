package com.example.hw_product_recycleview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.StoreDirections
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.Store
import com.example.hw_product_recycleview.data.DataSource

class SmartPhoneAdapter(private val context: Store, context1: Context) :
    RecyclerView.Adapter<SmartPhoneAdapter.SmartPhoneViewHolder>() {

    private val dataSource = DataSource.smartPhone

    class SmartPhoneViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val productImage: ImageView? = view?.findViewById(R.id.product_image)
        val productName: TextView? = view?.findViewById(R.id.product_name)
        val productPrice: TextView? = view?.findViewById(R.id.product_price)
        val productIsVip: ImageView? = view?.findViewById(R.id.isVip_icon)
        val addToCart: ImageButton? = view?.findViewById(R.id.add_to_cart)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartPhoneViewHolder {
        return SmartPhoneViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vertical_list_item, parent, false)
        )
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: SmartPhoneViewHolder, position: Int) {
        val item = dataSource[position]

        holder.productImage?.setImageResource(item.productImage)
        holder.productName?.text = context?.getString(item.productName)
        holder.productPrice?.text = item.productPrice

        if (item.isVip) {
            holder.productIsVip?.visibility = View.VISIBLE
        }
        holder.addToCart?.setOnClickListener {
            if (item.productQuantity > 0) {
//               Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()
            } else {
  //              Toast.makeText(context, "Item is out of stock", Toast.LENGTH_SHORT).show()
            }
        }

// stopped her (Perform the Navigation Action**)===================================================================
        holder.productImage?.setOnClickListener {

        val action = StoreDirections.actionBuyToStore( phoneInfo= holder.productName?.text.toString(),phoneImage =(item.productImage))
         holder.itemView.findNavController().navigate(action)

        }

    }

    override fun getItemCount(): Int = dataSource.size
}