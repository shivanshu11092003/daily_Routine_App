package com.example.practiceapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.databinding.ActivityHomePageBinding




class homePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityHomePageBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.getbtn.setOnClickListener {
            intent = Intent(this,dailytrack::class.java)
            startActivity(intent)
        }



    }


}