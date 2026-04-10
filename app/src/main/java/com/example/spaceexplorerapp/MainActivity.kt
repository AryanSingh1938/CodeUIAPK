package com.example.spaceexplorerapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.spaceexplorerapp.databinding.ActivityMainBinding
import com.example.spaceexplorerapp.R

class MainActivity : AppCompatActivity(), BookClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        planetsInfo()
        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,2)
            adapter = CardAdapter(planetList, mainActivity)
        }

    }

    override fun onClick(planet: Planet)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(PLANET_ID_EXTRA, planet.id)
        startActivity(intent)
    }
    private fun planetsInfo()
    {
        val planet1 = Planet(
            "Mercury",
            "The smallest planet and closest to the Sun. It has extreme temperatures and no atmosphere.",
            "57.9 million km",
            "4,879 km",
            "3.7 m/s²",
            "59 Earth days",
            "88 Earth days",
            0,
            R.drawable.mercury
        )
        planetList.add(planet1)
        val planet2 = Planet(
            "Venus",
            "A hot planet with a thick toxic atmosphere. It rotates in the opposite direction of most planets.",
            "108.2 million km",
            "12,104 km",
            "8.87 m/s²",
            "243 Earth days",
            "225 Earth days",
            0,
            R.drawable.venus
        )
        planetList.add(planet2)
        val planet3 = Planet(
            "Earth",
            "The only known planet to support life, with liquid water and a breathable atmosphere.",
            "149.6 million km",
            "12,742 km",
            "9.8 m/s²",
            "24 hours",
            "365 days",
            1,
            R.drawable.earth
        )
        planetList.add(planet3)
        val planet4 = Planet(
            "Mars",
            "Known as the Red Planet due to iron oxide on its surface. It may have had water in the past.",
            "227.9 million km",
            "6,779 km",
            "3.71 m/s²",
            "24.6 hours",
            "687 days",
            2,
            R.drawable.mars
        )
        planetList.add(planet4)
        val planet5 = Planet(
            "Jupiter",
            "The largest planet with a Great Red Spot storm and dozens of moons.",
            "778.5 million km",
            "139,820 km",
            "24.79 m/s²",
            "9.9 hours",
            "12 years",
            95,
            R.drawable.jupiter
        )
        planetList.add(planet5)

        val planet6 = Planet(
            "Saturn",
            "Famous for its beautiful rings made of ice and rock particles.",
            "1.43 billion km",
            "116,460 km",
            "10.44 m/s²",
            "10.7 hours",
            "29 years",
            146,
            R.drawable.saturn
        )
        planetList.add(planet6)

        val planet7 = Planet(
            "Uranus",
            "An ice giant that rotates on its side, giving it extreme seasons.",
            "2.87 billion km",
            "50,724 km",
            "8.69 m/s²",
            "17.2 hours",
            "84 years",
            27,
            R.drawable.uranus
        )
        planetList.add(planet7)

        val planet8 = Planet(
            "Neptune",
            "A deep blue ice giant known for its strong winds and storms.",
            "4.5 billion km",
            "49,244 km",
            "11.15 m/s²",
            "16.1 hours",
            "165 years",
            14,
            R.drawable.neptune
        )
        planetList.add(planet8)
        val moon = Planet(
            "Moon",
            "Earth's only natural satellite. It influences tides and has a rocky surface full of craters.",
            "384,400 km (from Earth)",
            "3,474 km",
            "1.62 m/s²",
            "27.3 days",
            "27.3 days (orbit around Earth)",
            0,
            R.drawable.moon
        )
        planetList.add(moon)
        val sun = Planet(
            "Sun",
            "The star at the center of our Solar System. It provides light and energy necessary for life on Earth.",
            "0 km (center of Solar System)",
            "1.39 million km",
            "274 m/s²",
            "25 days (equator rotation)",
            "225 million years (galactic orbit)",
            0,
            R.drawable.sun
        )
        planetList.add(sun)

        val sirius = Planet(
            "Sirius (Dog Star)",
            "The brightest star in the night sky, located in the constellation Canis Major.",
            "8.6 light years",
            "~2.4 million km",
            "Unknown",
            "Unknown",
            "Unknown",
            0,
            R.drawable.sirius
        )
        planetList.add(sirius)

        val polaris = Planet(
            "Polaris (North Star)",
            "A bright star located nearly at the north celestial pole, used for navigation.",
            "433 light years",
            "~44 million km",
            "Unknown",
            "Unknown",
            "Unknown",
            0,
            R.drawable.polaris
        )
        planetList.add(polaris)

        val milkyWay = Planet(
            "Milky Way Galaxy",
            "The galaxy that contains our Solar System, consisting of billions of stars, planets, and cosmic objects.",
            "—",
            "100,000 light years (diameter)",
            "—",
            "—",
            "225 million years (Sun orbit)",
            0,
            R.drawable.milkyway
        )
        planetList.add(milkyWay)

        val whirlpool = Planet(
            "Whirlpool Galaxy",
            "A spiral galaxy interacting with a nearby galaxy, famous for its well-defined structure.",
            "23 million light years",
            "~76,000 light years",
            "—",
            "—",
            "—",
            0,
            R.drawable.whirlpool
        )
        planetList.add(whirlpool)

    }

}