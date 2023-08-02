package com.example.unscramblecompose.data

import com.example.unscramblecompose.ui.screens.GameUiState

data class GameState (
    val gameUiState: GameUiState,
    val usedWords: Set<String>
)