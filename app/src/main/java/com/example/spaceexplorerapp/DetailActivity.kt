package com.example.spaceexplorerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spaceexplorerapp.databinding.ActivityDetailBinding
import com.example.spaceexplorerapp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val planetID = intent.getIntExtra(PLANET_ID_EXTRA,-1)
        val planet = planetFromID(planetID)
        if(planet != null){
            binding.image.setImageResource(planet.imageResId)
            binding.title.text = planet.name
            binding.description.text = planet.description
            binding.distancefromsun.text = "Distance from sun :${planet.distanceFromSun}"
            binding.diameter.text = "Planet's diameter :${planet.diameter}"
            binding.gravity.text = "Gravity on planet :${planet.gravity}"
            binding.dayLength.text = "Day Length: ${planet.dayLength}"
            binding.yearLength.text = "Year Length: ${planet.yearLength}"
            binding.moons.text = "Number of moons: ${planet.moons.toString()}"
        }
    }

    private fun planetFromID(planetID: Int): Planet?
    {
        for(planet in planetList)
        {
            if(planet.id == planetID)
            {
                return planet
            }
        }
        return null
    }
}