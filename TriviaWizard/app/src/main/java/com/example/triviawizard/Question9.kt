
package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion6Binding
import com.example.triviawizard.databinding.ActivityQuestion7Binding
import com.example.triviawizard.databinding.ActivityQuestion8Binding
import com.example.triviawizard.databinding.ActivityQuestion9Binding

class Question9 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion9Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button9.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q9Option2.isChecked){
            score++
        }
        listIntent = Intent(this, Question10::class.java)
        startActivity(listIntent)

    }
}