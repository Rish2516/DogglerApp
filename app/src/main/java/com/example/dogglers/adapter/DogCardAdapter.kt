package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.DataSource.DataSource
import com.example.dogglers.R
import com.example.dogglers.constant.Layout.GRID

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.ItemViewHolder>() {

    private val dogList = DataSource.Dog

    class ItemViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val dogname: TextView? = view!!.findViewById(R.id.dog_name)
        val dogimageView: ImageView? = view!!.findViewById(R.id.dog_image)
        val dogage: TextView? = view!!.findViewById(R.id.dog_age)
        val doghobby: TextView? = view!!.findViewById(R.id.dog_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = when (layout) {
            GRID ->LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            else -> LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val dogData = dogList[position]
        holder.dogimageView?.setImageResource(dogData.imageResourceId)
        holder.dogname?.text = dogData.Name
        val resources = context?.resources
        holder.dogage?.text = resources?.getString(R.string.dog_age, dogData.Age.toString())
        holder.doghobby?.text = resources?.getString(R.string.dog_hobbies, dogData.Hobbies)
    }

    override fun getItemCount(): Int {
        return dogList.size
    }
}
