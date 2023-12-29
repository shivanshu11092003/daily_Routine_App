package com.example.practiceapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ProgressBar
import android.widget.TextView

class dailytrack : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        var progressBar: ProgressBar? = null




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailytrack)

        progressBar = findViewById(R.id.progress_bar)
        var progressBar2: ProgressBar = findViewById(R.id.progress_bar2)

        progressBar2.progress=50

        val progressText: TextView = findViewById(R.id.progress_text)
        progressBar.progress = 75
        progressText.text = "${progressBar.progress}"







    }
}