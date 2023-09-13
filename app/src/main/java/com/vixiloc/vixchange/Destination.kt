package com.vixiloc.vixchange

sealed class Destination(val route: String) {
    object Home : Destination(route = "home")
    object Settings : Destination(route = "settings")
    object Splash : Destination(route = "splash")
}
