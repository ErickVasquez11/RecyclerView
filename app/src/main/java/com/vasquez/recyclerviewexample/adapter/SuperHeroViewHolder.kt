package com.vasquez.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vasquez.recyclerviewexample.SuperHero
import com.vasquez.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder (view:View) : RecyclerView.ViewHolder(view){
    /**
     * Incluyendo el DataBining
     */

    val binding = ItemSuperheroBinding.bind(view)

    /**
     * Crear una funcion render, lo cual esta funcion recibira un super heroe, que es un objeto
     * --- Creacion de un click a cada item con Toast
     */
    fun render(superHeroModel: SuperHero){
    binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.imageViewSuperHero.context).load(superHeroModel.photo).into(binding.imageViewSuperHero)
        binding.imageViewSuperHero.setOnClickListener { Toast.makeText(binding.imageViewSuperHero.context, superHeroModel.realName, Toast.LENGTH_SHORT).show() }

        itemView.setOnClickListener { Toast.makeText(binding.imageViewSuperHero.context, superHeroModel.superhero,
            Toast.LENGTH_SHORT).show()   }
    }
}