package com.vasquez.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vasquez.recyclerviewexample.R
import com.vasquez.recyclerviewexample.SuperHero

class SuperHeroAdapter(private val superHeroList:List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>(){

    /**
    Segundo paso, Se mandara a llamar con cada uno de los Items del Listado
     ---- Tenemos que irnos al res, Layout, para crear uno -> item_superhero
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    /**
     * Pasara por cada uno de los items y llamada los super heroes
     */
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
    val item = superHeroList[position]
        holder.render(item)
    }

    /**
     Primer paso, que devolveremos un tamaño
     */
    override fun getItemCount(): Int = superHeroList.size


}