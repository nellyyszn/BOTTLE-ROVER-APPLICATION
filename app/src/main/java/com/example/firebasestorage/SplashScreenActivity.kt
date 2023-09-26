package com.example.firebasestorage

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.firebasestorage.navigation.ROUT_START
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            splash()
            val mContext = LocalContext.current
            val coroutinScope = rememberCoroutineScope()
            coroutinScope.launch{
                delay(1000)
                mContext.startActivity(Intent(mContext, ROUT_START::class.java))
                finish()
            }
        }
    }
}
@Composable
fun splash() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.first))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier = Modifier.size(500.dp))

        Spacer(modifier =Modifier.height(10.dp))

        Text(text = "BOTTLE ROVER",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black)

        //LinearProgressIndicator
        LinearProgressIndicator(
            modifier = Modifier.padding(20.dp)
                .height(10.dp),
            color = Color.Yellow
        )
    }

}

@Preview(showBackground = true)
@Composable
fun splashPreview() {
    splash()

}