package com.example.triviawizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityActualQuestion3Binding
import com.example.triviawizard.databinding.ActivityQuestion3Binding

class ActualQuestion3 : AppCompatActivity() {
    private lateinit var binding: ActivityActualQuestion3Binding
    private lateinit var listIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActualQuestion3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q3Option2.isChecked){
            score++
        }
        listIntent = Intent(this, Question4::class.java)
        startActivity(listIntent)

    }
}