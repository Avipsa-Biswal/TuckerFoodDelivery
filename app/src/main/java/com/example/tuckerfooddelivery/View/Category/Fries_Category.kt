package com.example.tuckerfooddelivery.View.Category

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import androidx.navigation.NavController
import com.example.tuckerfooddelivery.R
import com.example.tuckerfooddelivery.View.Profile.CircularButtonWithSymbol
import com.example.tuckerfooddelivery.ViewModel.ScreenHeight
import com.example.tuckerfooddelivery.ViewModel.ScreenWidth

@Composable
fun Fries_Category(navController: NavController) {

    var cardwidth = 0.4 * ScreenWidth
    var cardheight = 0.4 * ScreenHeight
    var Boxwidth = 1.2 * cardwidth

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, top = 10.dp, end = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircularButtonWithSymbol {
                navController.popBackStack()
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(Boxwidth)
                    .height(60.dp),
                shape = RoundedCornerShape(36.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                border = BorderStroke(1.dp, Color.Black),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Popular Fries",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                }
            }
        }
        //1st row of 2 cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier
                    .height(cardheight)
                    .width(cardwidth)
                    .clickable { navController.navigate("ClassicFrenchFries") }
                    .wrapContentHeight(),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(7.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally// Add some padding inside the card
                ) {
                    Image(
                        painter = painterResource(R.drawable.classic_french_fries),
                        contentDescription = "classic_french_fries Image",
                        modifier = Modifier
                            .size(cardwidth)
                    )
                    Text(
                        text = "Classic Fries",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 4.dp) // Adjust top padding
                    )
                    Text(
                        text = "Rose Garden",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(1.dp)
                    )
                    Text(
                        text = "Rs.39",
                        fontSize = 22.sp,
                        modifier = Modifier.padding(top = 5.dp),
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(0.02 * cardheight))

                }
            }

            Card(
                modifier = Modifier
                    .height(cardheight)
                    .width(cardwidth)
                    .clickable { navController.navigate("PeriPeriFries") }
                    .wrapContentHeight(),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(7.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally// Add some padding inside the card
                ) {
                    Image(
                        painter = painterResource(R.drawable.peri_peri_fries),
                        contentDescription = "peri_peri_fries Image",
                        modifier = Modifier
                            .size(cardwidth)
                    )
                    Text(
                        text = "Peri-peri Fries",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 4.dp) // Adjust top padding
                    )
                    Text(
                        text = "SkyHigh Way",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 1.dp)
                    )

                        Text(
                            text = "Rs.49",
                            modifier = Modifier.padding(top = 5.dp),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )

                    Spacer(modifier = Modifier.height(0.02 * cardheight))

                }
            }
        }

    }
}
