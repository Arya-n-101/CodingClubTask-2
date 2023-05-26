package com.example.triviawizard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.triviawizard.databinding.ActivityQuestion1Binding

class Question1 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion1Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{loadQuestions()}

    }
    private fun loadQuestions(){
        if(binding.q1Option4.isChecked){
            score++
        }
        listIntent = Intent(this, Question3::class.java)
        startActivity(listIntent)

    }




}