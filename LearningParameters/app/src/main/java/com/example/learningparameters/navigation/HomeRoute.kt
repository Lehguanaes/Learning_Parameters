package com.example.learningparameters.navigation

import androidx.compose.runtime.Composable
import com.example.learningparameters.data.User
import com.example.learningparameters.data.getUserData
import com.example.learningparameters.ui.theme.screen.HomeScreen

@Composable
fun HomeRoute(userName: String) {
    val user: User = getUserData(userName = userName)
    HomeScreen(user = user)
}