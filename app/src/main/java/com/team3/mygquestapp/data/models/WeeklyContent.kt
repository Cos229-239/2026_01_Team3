package com.team3.mygquestapp.data.models

data class WeeklyContent(
    val id: String = "",
    val gameId: String = "",
    val title: String = "",
    val description: String = "",
    val difficulty: String = "",
    val rewards: List<String> = emptyList(),
    val startDate: String = "",
    val endDate: String = "",
    val isCompleted: Boolean = false
)