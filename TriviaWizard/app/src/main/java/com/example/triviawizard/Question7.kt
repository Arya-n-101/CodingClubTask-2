
package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion6Binding
import com.example.triviawizard.databinding.ActivityQuestion7Binding

class Question7 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion7Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button7.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q7Option4.isChecked){
            score++
        }
        listIntent = Intent(this, Question8::class.java)
        startActivity(listIntent)

    }
}