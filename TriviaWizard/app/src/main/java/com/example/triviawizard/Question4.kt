package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion4Binding

class Question4 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion4Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q4Option2.isChecked){
            score++
        }
        listIntent = Intent(this, Question5::class.java)
        startActivity(listIntent)

    }
}