package com.example.triviawizard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triviawizard.databinding.ActivityScoreboardBinding

class Scoreboard : AppCompatActivity() {

    private lateinit var binding: ActivityScoreboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textView5.text = getString(R.string.score,score)
    }
}