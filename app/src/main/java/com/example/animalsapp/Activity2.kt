package com.example.animalsapp


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animalsapp.databinding.Activity2Binding
import com.example.animalsapp.databinding.ActivityMainBinding
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class Activity2 : AppCompatActivity() {
   private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal = intent.getParcelableExtra<AnimalsInfo>("animal")

        binding.AnimalsName.text = animal!!.name
        binding.textInfo.text = animal!!.moreinfo
        binding.AnimalImage.setImageResource(animal.image)





    }
}