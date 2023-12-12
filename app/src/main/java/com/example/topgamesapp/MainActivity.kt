package com.example.topgamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
            false)

        val gamesList: ArrayList<GameModel> = ArrayList()

        val g1 = GameModel(R.drawable.card1, "HorizonChase")
        val g2 = GameModel(R.drawable.card2, "PUBG")
        val g3 = GameModel(R.drawable.card3, "HeadBall")
        val g4 = GameModel(R.drawable.card4, "Hooked On You")
        val g5 = GameModel(R.drawable.card5, "Fifa22 mobile")
        val g6 = GameModel(R.drawable.card6, "Fortnite")
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)

        val adapter = Adapter(gamesList)
        recyclerView.adapter = adapter
    }
}