package com.aprendiendoandroidstudio.recyclerviewuno.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aprendiendoandroidstudio.recyclerviewuno.Animal
import com.aprendiendoandroidstudio.recyclerviewuno.R
import com.bumptech.glide.Glide

class AnimalViewHolder (view: View): RecyclerView.ViewHolder(view){

    val photo = view.findViewById<ImageView>(R.id.ivAnimal)
    val name = view.findViewById<TextView>(R.id.tvName)
    val bodyType = view.findViewById<TextView>(R.id.tvBodyType)
    val feeding = view.findViewById<TextView>(R.id.tvFeeding)
    val habitat = view.findViewById<TextView>(R.id.tvHabitat)
    val reproduction = view.findViewById<TextView>(R.id.tvReproduction)

    fun render(animalModel: Animal){
        name.text = animalModel.name
        bodyType.text = animalModel.bodyType
        feeding.text = animalModel.feeding
        habitat.text = animalModel.habitat
        reproduction.text = animalModel.reproduction
        Glide.with(photo.context).load(animalModel.photo).into(photo)
    }
}