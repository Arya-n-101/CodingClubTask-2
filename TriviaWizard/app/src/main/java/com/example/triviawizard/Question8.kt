
package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion6Binding
import com.example.triviawizard.databinding.ActivityQuestion7Binding
import com.example.triviawizard.databinding.ActivityQuestion8Binding

class Question8 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion8Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button8.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q8Option1.isChecked){
            score++
        }
        listIntent = Intent(this, Question9::class.java)
        startActivity(listIntent)

    }
}