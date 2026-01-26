package com.team3.mygquestapp.data.models

data class InventoryItem(
    val id: String = "",
    val gameId: String = "",
    val name: String = "",
    val description: String = "",
    val type: String = "", // weapon, armor, consumable, etc.
    val isTracked: Boolean = false,
    val notes: String = "",
    val imageUrl: String? = null
)