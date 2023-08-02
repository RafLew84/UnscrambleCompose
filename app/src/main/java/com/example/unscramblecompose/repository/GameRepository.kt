package com.example.unscramblecompose.repository

import android.app.Application
import com.example.unscramblecompose.data.GameState
import com.example.unscramblecompose.data.GameStateDataStore

class GameRepository(private val application: Application) {
    fun loadGameState() = GameStateDataStore.loadGameState(application)
    suspend fun saveGameState(state: GameState) = GameStateDataStore.saveGameState(application, state)
}