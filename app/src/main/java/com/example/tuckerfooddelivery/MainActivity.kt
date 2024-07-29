package com.example.tuckerfooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.tuckerfooddelivery.ui.theme.TuckerFoodDeliveryTheme
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tuckerfooddelivery.View.Burger_Category
//import com.example.tuckerfooddelivery.View.ItemDetails
//import com.example.tuckerfooddelivery.View.ItemDetails2
//import com.example.tuckerfooddelivery.View.ItemDetails3
import com.example.tuckerfooddelivery.View.PersonalInfoDetails
import com.example.tuckerfooddelivery.View.Pizza
import com.example.tuckerfooddelivery.View.Pizza_2
import com.example.tuckerfooddelivery.View.Pizza_3
import com.example.tuckerfooddelivery.View.Start
import com.example.tuckerfooddelivery.View.Start2
import com.example.tuckerfooddelivery.View.Start3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            TuckerFoodDeliveryTheme {
                //ItemDetails()
               // PersonalInfoDetails()
                Burger_Category()
            //AppNavigation()
            }
        }
    }
}


    //Navigation
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        enterTransition = { fadeIn(animationSpec = tween(200)) +
                slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left,
            tween(200)
        ) },
        exitTransition = { fadeOut(animationSpec = tween(200))  +
                slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left,
                    tween(200) )},
        startDestination = "Start"
    ) {
        composable("Start") { Start(navController) }
        composable("Start2") { Start2(navController) }
        composable("Start3") { Start3(navController) }
        composable("Start") { Start(navController) }
        composable("Pizza"){ Pizza(navController) }
        composable("Pizza2"){ Pizza_2(navController) }
        composable("Pizza_3"){ Pizza_3(navController)}

    }
}


