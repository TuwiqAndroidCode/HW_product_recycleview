package com.example.hw_product_recycleview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.SmartPhoneActivity
import com.example.hw_product_recycleview.conistant.ProductInfo
import com.example.hw_product_recycleview.data.DataSource

class SmartPhoneAdapter(private val context: Context?) :
    RecyclerView.Adapter<SmartPhoneAdapter.SmartPhoneViewHolder>() {

    // Initialize the data from DataSource class
    private val dataSource = DataSource.smartPhone

    class SmartPhoneViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {

        // Initialize the view elements
        val productImage: ImageView? = view?.findViewById(R.id.product_image)
        val productName: TextView? = view?.findViewById(R.id.product_name)
        val productPrice: TextView? = view?.findViewById(R.id.product_price)
        val productIsVip: ImageView? = view?.findViewById(R.id.isVip_icon)
        val addToCart: ImageButton? = view?.findViewById(R.id.add_to_cart)

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartPhoneViewHolder {
        return SmartPhoneViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
        )
    }


    override fun onBindViewHolder(holder: SmartPhoneViewHolder, position: Int) {
        val item = dataSource[position]
        holder.productImage?.setImageResource(item.productImage)
        holder.productName?.text = context?.getString(item.productName)
        holder.productPrice?.text = item.productPrice

        // check if the smart phone isVip make the view visible
        if (item.isVip) {
            holder.productIsVip?.visibility = View.VISIBLE
        }

        // change the color of add to cart button if the product is out of stock
        if(item.productQuantity > 0){
            holder.addToCart?.setBackgroundColor(context?.getColor(R.color.red)!!)
        }

        // check if the product quantity out of stock when clicking on add to cart button
        holder.addToCart?.setOnClickListener {
            if (item.productQuantity > 0) {
                Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "The item is out of stock", Toast.LENGTH_SHORT).show()
            }
        }

        // start SmartPhoneActivity when the user click on the image of the product
        holder.productImage?.setOnClickListener {
            val intent = Intent(context, SmartPhoneActivity::class.java)
            intent.putExtra(ProductInfo.PHONE_NAME, context?.getString(item.productName))
            intent.putExtra(ProductInfo.PHONE_IMAGE, item.productImage)
            intent.putExtra(ProductInfo.PHONE_PRICE, item.productPrice)
            it?.context?.startActivity(intent)

        }

    }

    override fun getItemCount(): Int = dataSource.size

}