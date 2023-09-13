package com.vixiloc.vixchange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vixiloc.vixchange.home_screen.HomeScreen
import com.vixiloc.vixchange.settings_screen.SettingsScreen
import com.vixiloc.vixchange.splash_screen.SplashScreen
import com.vixiloc.vixchange.ui.theme.VixchangeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VixchangeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navHostController = rememberNavController()
                    NavHost(
                        navController = navHostController,
                        startDestination = Destination.Splash.route
                    ) {
                        composable(route = Destination.Splash.route) {
                            SplashScreen(navHostController = navHostController)
                        }
                        composable(route = Destination.Home.route) {
                            HomeScreen(navHostController = navHostController)
                        }
                        composable(route = Destination.Settings.route) {
                            SettingsScreen(navHostController = navHostController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VixchangeTheme {
        Greeting("Android")
    }
}