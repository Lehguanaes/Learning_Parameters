package com.example.learningparameters.navigation

import com.example.learningparameters.navigation.Routes.HOME_ROUTE
import com.example.learningparameters.navigation.Routes.LOGIN_ROUTE

sealed class Screens (val route:String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}