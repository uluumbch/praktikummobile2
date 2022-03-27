package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var rollButton: Button = binding.rollButton
        diceImage1 = binding.diceImage1
        diceImage2 = binding.diceImage2
        rollButton.setOnClickListener{rollDice()}
    }
    private fun rollDice(){
        var dice1 = roll1()
        var dice2 = roll2()
        diceImage1.setImageResource(dice1)
        diceImage2.setImageResource(dice2)
        if (dice1 == dice2){
            Toast.makeText(this,"Selamat anda dapat dadu double!",
                Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Anda belum beruntung!",
            Toast.LENGTH_LONG).show()
        }

    }

    private fun roll1(): Int {
        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun roll2(): Int {
        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*
    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text=="Halo Dunia!"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()
            if (resultInt<6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
    */
}