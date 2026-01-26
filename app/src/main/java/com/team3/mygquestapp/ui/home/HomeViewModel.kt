package com.team3.mygquestapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.team3.mygquestapp.data.repository.GameRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val gameRepository = GameRepository()

    private val _userGames = MutableStateFlow<List<String>>(emptyList())
    val userGames: StateFlow<List<String>> = _userGames

    fun loadUserGames(userId: String) {
        viewModelScope.launch {
            // Load user's selected games
        }
    }
}