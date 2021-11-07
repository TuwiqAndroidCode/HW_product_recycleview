package com.example.hw_product_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class ItemAdapter(private val dataSet : List<Product> , private val context: Context)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {



    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val phoneName: TextView = view.findViewById(R.id.item_name)
        val image: ImageView = view.findViewById(R.id.item_image)
        val vip: ImageView = view.findViewById(R.id.star)
        val price: TextView = view.findViewById(R.id.item_price)
        val buy: Button = view.findViewById(R.id.buy)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]

        holder.image?.setImageResource(item.productImage)
        holder.phoneName?.text = context.getString(item.productNameId)
        holder.price?.text = context.getString(item.productPrice)




    }
}