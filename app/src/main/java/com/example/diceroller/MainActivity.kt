package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                setContentView(R.layout.main_activity)
                val rollButton : Button=findViewById(R.id.button)
                rollButton.setOnClickListener {
                    Toast.makeText(this,"Dice rolled!",Toast.LENGTH_SHORT).show()
                    diceRoll()
                }
            }
        }
    }

    private fun diceRoll() {

        val dice=Dice(6)
        val rollDice=dice.roll()
        val diceImage : ImageView =findViewById(R.id.imageView)
        val drawableResource=when(rollDice){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription=rollDice.toString()
    }

    class Dice(val numsides:Int){
    fun roll():Int{
        return (1..numsides).random()
    }

}}
