package com.vasquez.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vasquez.recyclerviewexample.adapter.SuperHeroAdapter
import com.vasquez.recyclerviewexample.databinding.ActivityMainBinding

// 1.0 Crear un RecyclerView, nos iremos al activity_main
// 2.0 El RecyclerView, Funciona como una lista
// 3.0 Crear un Class, Click Derecho, New, Kotlin Class, Clase llamada como la lista que se quiere
// 4.0 Crear una Class, Para la lista de personajes -> SuperHeroProvider
// 5.0 Crear un Package, un directorio llamado adapter -> com.vasquez.recyclerviewexample.adapter
// 6.0 Crear una Class -> SuperHeroAdapter
// 6.0 Crear una Class -> SuperHeroViewHolder
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    /**
     * Creacion de un metodo para los items
     *
     */
    fun initRecyclerView(){

        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList


        )
    }
}