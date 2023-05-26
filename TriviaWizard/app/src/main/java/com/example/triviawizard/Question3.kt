package com.example.triviawizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion3Binding



class Question3 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion3Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener{loadQuestions()}


    }

    private fun loadQuestions(){
        if(binding.q2Option1.isChecked){
            score++
        }
        listIntent = Intent(this, ActualQuestion3::class.java)
        startActivity(listIntent)

    }

}