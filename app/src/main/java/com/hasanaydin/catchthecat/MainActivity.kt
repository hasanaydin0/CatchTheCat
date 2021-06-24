package com.hasanaydin.catchthecat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanaydin.catchthecat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun increaseScore(view : View){
        score++
        binding.scoreText.text = "Score: $score"
    }
}