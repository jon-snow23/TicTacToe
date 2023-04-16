package com.shiva.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.shiva.tictactoe.databinding.ActivityAddPlayersBinding

class AddPlayers : AppCompatActivity() {

    private lateinit var binding: ActivityAddPlayersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startGameButton.setOnClickListener {
            val getPlayerOneName = binding.playerOne.text.toString()
            val getPlayerTwoName = binding.playerTwo.text.toString()

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                Toast.makeText(this@AddPlayers, "Please enter player name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@AddPlayers, MainActivity::class.java)
                intent.putExtra("playerOne", getPlayerOneName)
                intent.putExtra("playerTwo", getPlayerTwoName)
                startActivity(intent)
            }
        }
    }
}