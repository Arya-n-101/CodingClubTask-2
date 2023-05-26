
package com.example.triviawizard
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityQuestion10Binding


class Question10 : AppCompatActivity() {

    private lateinit var binding: ActivityQuestion10Binding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button10.setOnClickListener{loadQuestions()}


    }


    private fun loadQuestions(){
        if(binding.q10Option2.isChecked){
            score++
        }
        listIntent = Intent(this, Scoreboard::class.java)
        startActivity(listIntent)

    }
}