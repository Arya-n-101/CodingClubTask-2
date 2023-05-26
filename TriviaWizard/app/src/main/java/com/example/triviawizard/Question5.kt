package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion5Binding

class Question5 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion5Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q5Option4.isChecked){
            score++
        }
        listIntent = Intent(this, Question6::class.java)
        startActivity(listIntent)

    }
}