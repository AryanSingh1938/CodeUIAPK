package com.example.spaceexplorerapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceexplorerapp.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        binding.btnSignUp.setOnClickListener {
            Toast.makeText(this,"Signed Up Successfully", Toast.LENGTH_SHORT)
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}