package com.deepaliverma.roomdatabasedemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomerAdapter(val context: Context) :
    RecyclerView.Adapter<CustomerAdapter.CustomerViewHolder>() {
    val allUser = ArrayList<User>()

    inner class CustomerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvname = itemView.findViewById<TextView>(R.id.name)
        val tvnumber = itemView.findViewById<TextView>(R.id.number)
        val tvamount: TextView = itemView.findViewById(R.id.amount)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerViewHolder{
        val viewHolder = CustomerViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        )
        return viewHolder

    }



    override fun onBindViewHolder(holder: CustomerViewHolder, position: Int) {
        val currentUser = allUser[position]

        holder.tvname.text = currentUser.name
        holder.tvamount.text = currentUser.amount.toString()
        holder.tvnumber.text = currentUser.number
    }

    fun updateList(newList: List<User>) {
        allUser.clear()
        allUser.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return allUser.size
    }

    override fun getItemId(position: Int): Long {
        return allUser[position].id
    }



}
