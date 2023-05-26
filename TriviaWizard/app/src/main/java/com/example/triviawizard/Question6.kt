
package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion6Binding

class Question6 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion6Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button6.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q6Option2.isChecked){
            score++
        }
        listIntent = Intent(this, Question7::class.java)
        startActivity(listIntent)

    }
}