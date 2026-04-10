package com.example.spaceexplorerapp

var planetList = mutableListOf<Planet>()
val PLANET_ID_EXTRA = "planetsExtra"
data class Planet(
    val name: String,
    val description: String,
    val distanceFromSun: String,
    val diameter: String,
    val gravity: String,
    val dayLength: String,
    val yearLength: String,
    val moons: Int,
    val imageResId: Int,
    val id: Int? = planetList.size
)