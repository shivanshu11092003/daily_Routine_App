package com.example.practiceapp


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import com.example.practiceapp.databinding.ActivityDailytrackBinding

class dailytrack : AppCompatActivity() {
    private lateinit var binding: ActivityDailytrackBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        var progressBar: ProgressBar? = null
        super.onCreate(savedInstanceState)
        binding= ActivityDailytrackBinding.inflate(layoutInflater)






        setContentView(binding.root)


        val clickbtn=findViewById<RelativeLayout>(R.id.progress_layout)
        clickbtn.setOnClickListener {
            intent=Intent(this,calorieStatus::class.java)
            startActivity(intent)
        }

        progressBar = findViewById(R.id.progress_bar)
        var progressBar2: ProgressBar = findViewById(R.id.progress_bar2)

        progressBar2.progress=50

        val progressText: TextView = findViewById(R.id.progress_text)
        progressBar.progress = 75
        progressText.text = "${progressBar.progress}"







    }
}