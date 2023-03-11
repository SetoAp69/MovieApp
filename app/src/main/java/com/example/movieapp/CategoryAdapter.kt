package com.example.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter (val listData: List<String>): RecyclerView.Adapter<CategoryAdapter.ListViewHolder>(){
    inner class ListViewHolder(listView: View):RecyclerView.ViewHolder(listView){
        val nameCategory :TextView=itemView.findViewById(R.id.tv_category)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {//Memanggil item apa yang akan ditampilkan seperti create insctance
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {//Text dari item akaan diarahkan ke mana
        TODO("Not yet implemented")
        val data=listData[position]
        holder.nameCategory.text=data
    }

    override fun getItemCount(): Int {//jumlah list yang akan ditampilkan
        TODO("Not yet implemented")
        return listData.size
    }
}