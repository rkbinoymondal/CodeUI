package com.example.codeui.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codeui.Model.ProfileData
import com.example.codeui.R

class ProfileAdapter(val context : Context, val list : List<ProfileData>) : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.profile_layout,parent,false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.desc.text = list[position].description
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title = itemView.findViewById<TextView>(R.id.heading)
        var desc = itemView.findViewById<TextView>(R.id.description)
    }
}

