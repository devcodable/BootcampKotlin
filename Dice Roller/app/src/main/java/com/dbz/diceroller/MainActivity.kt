package com.dbz.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dbz.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpView()
    }

    private fun setUpView() {
        this.binding.rollButton.setOnClickListener {
            rollDice()
            //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val random = Random().nextInt(6) + 1
        binding.resultText.text = random.toString()
    }

}