package com.example.triviawizard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviawizard.databinding.ActivityMainBinding

var score : Int = 0

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.button.setOnClickListener{loadQuestions()}

    }
    private fun loadQuestions(){
        listIntent = Intent(this, Question1::class.java)
        startActivity(listIntent)
    }
}