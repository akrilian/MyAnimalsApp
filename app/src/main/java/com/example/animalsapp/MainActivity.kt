package com.example.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animalsapp.databinding.ActivityMainBinding
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal1 = AnimalsInfo(
            getString(R.string.pet1),
            getString(R.string.more_pet1),
            R.drawable.pet1image,
            getString(R.string.decr_pet1)
        )

        binding.namePet1.text = animal1!!.name
        binding.pet1image.setImageResource(animal1.image)
        binding.morePet1.text = animal1!!.act1descr

        binding.pet1butt.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal", animal1)
            startActivity(intent)
        }
        val animal2 = AnimalsInfo(
            getString(R.string.pet2),
            getString(R.string.more_pet2),
            R.drawable.pet2image,
            getString(R.string.decr_pet2)
        )

        binding.namePet2.text = animal2!!.name
        binding.pet2image.setImageResource(animal2.image)
        binding.morePet2.text = animal2!!.act1descr

        binding.pet2butt.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal", animal2)
            startActivity(intent)
        }

            val animal3 = AnimalsInfo(
                getString(R.string.pet3),
                getString(R.string.more_pet3),
                R.drawable.pet3image,
                getString(R.string.decr_pet3)
            )

            binding.namePet3.text = animal3!!.name
            binding.pet3image.setImageResource(animal3.image)
            binding.morePet3.text = animal3!!.act1descr

            binding.pet3butt.setOnClickListener {
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("animal", animal3)
                startActivity(intent)

            }

    }
    companion object {
        const val animal = "Key_animal"
    }
}





