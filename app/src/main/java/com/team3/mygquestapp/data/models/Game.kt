package com.team3.mygquestapp.data.models

data class Game(
    val id: String = "",
    val name: String = "",
    val iconUrl: String = "",
    val isSelected: Boolean = false,
    val supportedFeatures: List<String> = emptyList() // ["inventory", "weekly", "guides"]
)