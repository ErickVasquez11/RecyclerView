package com.vasquez.recyclerviewexample
// 1.0 Crearemos un modelo de datos, para crear un listado, para ello utilizaremos un DataClass
// 2.0 Al data Class se le tienen que pasar varios parametros

data class SuperHero(
    val superhero:String,
    val publisher:String,
    val realName:String,
    val photo:String
    )
// 3.0 Ya tenemos la data Class completada