package com.example.kotlin_parce

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_parce.databinding.ActivityMainBinding
import com.example.kotlin_parce.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user: UserID = intent.getParcelableExtra("user")!!


        binding.tvName.text = user.name
        binding.tvEmail.text = user.email
    }
}