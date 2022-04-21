package com.vasquez.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// 1.0 Crear un RecyclerView, nos iremos al activity_main
// 2.0 El RecyclerView, Funciona como una lista
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}