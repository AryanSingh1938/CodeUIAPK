package com.example.spaceexplorerapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.spaceexplorerapp.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this@SplashActivity)
            .asGif()
            .load(R.drawable.stars)
            .into(binding.iv2)


//        Handler(Looper.getMainLooper()).postDelayed({
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        },7000)
        binding.btnExplore.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            finish()
        }

    }
}