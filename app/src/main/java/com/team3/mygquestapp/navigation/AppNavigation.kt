package com.team3.mygquestapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.team3.mygquestapp.ui.auth.LoginScreen
import com.team3.mygquestapp.ui.home.HomeScreen
import com.team3.mygquestapp.ui.profiles.GameProfilesScreen
import com.team3.mygquestapp.ui.inventory.InventoryScreen
import com.team3.mygquestapp.ui.weekly.WeeklyTrackerScreen
import com.team3.mygquestapp.ui.progress.ProgressScreen
import com.team3.mygquestapp.ui.guides.GuidesScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("profiles") {
            GameProfilesScreen(navController = navController)
        }
        composable("inventory") {
            InventoryScreen(navController = navController)
        }
        composable("weekly") {
            WeeklyTrackerScreen(navController = navController)
        }
        composable("progress") {
            ProgressScreen(navController = navController)
        }
        composable("guides") {
            GuidesScreen(navController = navController)
        }
    }
}