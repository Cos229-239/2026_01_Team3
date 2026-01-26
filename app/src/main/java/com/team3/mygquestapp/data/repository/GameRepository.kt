package com.team3.mygquestapp.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.team3.mygquestapp.data.models.Game
import kotlinx.coroutines.tasks.await

class GameRepository {
    private val db = FirebaseFirestore.getInstance()
    private val gamesCollection = db.collection("games")

    suspend fun getGames(): List<Game> {
        return try {
            gamesCollection.get().await().documents.map { document ->
                document.toObject(Game::class.java)!!
            }
        } catch (e: Exception) {
            emptyList()
        }
    }

    suspend fun updateUserGames(userId: String, selectedGameIds: List<String>) {
        // Implementation
    }
}