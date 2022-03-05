package com.example.kotlin_parce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_parce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener{
            if(binding.etName.text.isNotEmpty() && binding.etEmail.text.isNotEmpty()){

                val name = binding.etName.text.toString()
                val email = binding.etEmail.text.toString()

                val user: UserID = UserID(name, email)

                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }
    }
}