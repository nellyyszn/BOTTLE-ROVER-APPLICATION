package com.example.firebasestorage.screens.store

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun StoreinfoScreen(navController: NavController) {
    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Store info",
                    textAlign = TextAlign.Center
                )
            },
            navigationIcon = {
                IconButton(onClick = {

                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
                }

            },
            backgroundColor = Color.Yellow,
            actions = {
                IconButton(onClick = {

                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0791593311".toUri()
                    mContext.startActivity(callIntent)
                }) {
                    Icon(imageVector = Icons.Filled.Call, contentDescription = "CALL")
                }
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("nellytoho306@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Alcohol Inquiry")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello..,")
                    mContext.startActivity(shareIntent)

                }) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "")
                }
            }
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Mission Wines And Spirits - Woodlands HiLLS CA",
            fontSize = 15.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp),
            textAlign = TextAlign.Left
        )

        Text(
            text = "6307 Platt Ave",
            fontSize = 15.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp),
            textAlign = TextAlign.Left
        )

        Text(
            text = "Tel: (254) 791593311",
            fontSize = 15.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp),
            textAlign = TextAlign.Left
        )

        Text(
            text = "Store Hours",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp),
            textAlign = TextAlign.Left
        )

        //Row1
        Row {

            Text(
                text = "Monday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }
        Row {

            Text(
                text = "Tuesday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black

            )
        }
        Row {

            Text(
                text = "Wednesday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )
            Spacer(modifier = Modifier.width(130.dp))
            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )

        }
        Row {

            Text(
                text = "Thursday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }
        Row {

            Text(
                text = "Friday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 25.dp)
            )
        }
        Row {

            Text(
                text = "Saturday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "9:00AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )
        }
        Row {

            Text(
                text = "Sunday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 5.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "11:00AM-5:00PM",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 15.dp)
            )

        }

        Spacer(modifier = Modifier.height(10.dp))
        Divider()

        Text(
            text = "Delivery Hours",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp),
            textAlign = TextAlign.Left
        )

        //Row2
        Row {

            Text(
                text = "Monday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }

        Row {

            Text(
                text = "Tuesday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }
        Row {
            Text(
                text = "Wednesday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(130.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }
        Row {

            Text(
                text = "Thursday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(135.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }
        Row {
            Text(
                text = "Friday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 15.dp)
            )

        }
        Row {

            Text(
                text = "Saturday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(135.dp))

            Text(
                text = "10:30AM-8:00PM",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 2.dp)
            )
        }
        Row {

            Text(
                text = "Sunday",
                fontSize = 17.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(150.dp))

            Text(
                text = "12:OOPM-4:00PM",
                fontSize = 17.sp,
                color = Color.Black
            )
        }

    }
}
@Preview(showBackground = true)
@Composable
fun StoreinfoPreview(){
    StoreinfoScreen(rememberNavController())
}