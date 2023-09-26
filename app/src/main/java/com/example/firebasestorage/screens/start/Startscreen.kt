package com.example.firebasestorage.screens.start

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@Composable
fun Startscreen(navController: NavHostController) {
    val mContext = LocalContext.current



    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.img), contentScale = ContentScale.FillBounds)) {

        Spacer(modifier = Modifier.height(30.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Box( modifier = Modifier.fillMaxWidth(),  contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_46),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                Text(
                    text = "BOTTLEROVER",
                    textAlign = TextAlign.End,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Alcohol ON-Demand",
                    textAlign = TextAlign.End,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start = 80.dp),
                    fontFamily = FontFamily.Monospace
                )

            }
        }
        Spacer(modifier = Modifier.height(90.dp))

        Button(onClick = {
            navController.navigate(ROUT_SIGNUP)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = CutCornerShape(5.dp)
        ) {
            Text(text = "REGISTER")

        }
        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = CutCornerShape(5.dp)
        ) {
            Text(text = "LOGIN")

        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "By signing in you agree to the terms as service and privacy policy and represent you are 21 0r older",
            color = Color.White,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp))
        Spacer(modifier = Modifier.height(10.dp))

        Box( modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Row() {
                Text(text = "Powered by",
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "BOTTLECAPPS",
                    color = Color.White)

            }

        }






    }
}

@Preview(showBackground = true)
@Composable
fun startscreenPreview(){
    Startscreen(navController = rememberNavController())
}

