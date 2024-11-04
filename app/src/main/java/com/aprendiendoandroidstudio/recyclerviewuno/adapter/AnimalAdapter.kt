package com.aprendiendoandroidstudio.recyclerviewuno.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aprendiendoandroidstudio.recyclerviewuno.Animal
import com.aprendiendoandroidstudio.recyclerviewuno.R

class AnimalAdapter (private val animalList:List<Animal>): RecyclerView.Adapter<AnimalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AnimalViewHolder(layoutInflater.inflate(R.layout.item_animal, parent, false))
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val item = animalList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }
//    override fun getItemCount(): Int = animalList.size

}