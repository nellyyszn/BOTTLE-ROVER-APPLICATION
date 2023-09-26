package com.example.firebasestorage.screens.signup
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.firebasestorage.R
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_LOGIN


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {
    var mContext = LocalContext.current
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var age by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

        //TopAppBar
        TopAppBar(title = { Text(text = "Create an account")},
            navigationIcon = {
                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Filled.Menu , contentDescription = "Menu")
                }
            },
            backgroundColor = Color.Yellow)


        Spacer(modifier = Modifier.height(20.dp))

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.first))
        val progress by animateLottieCompositionAsState(composition )

        LottieAnimation(composition, progress,
            modifier = Modifier.size(250.dp))

        //Textfields
        Column(modifier = Modifier.padding(20.dp)) {

            TextField(value = username ,
                onValueChange = {username=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, Color.Yellow) ,
                label = { Text(text = "Username")},
                placeholder = { Text(text = "Enter username")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(value = email ,
                onValueChange = {email=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, Color.Yellow)  ,
                label = { Text(text = "Email Address")},
                placeholder = { Text(text = "Enter email")},
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(value = password ,
                onValueChange = {password=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, Color.Yellow),
                label = { Text(text = "Password")},
                placeholder = { Text(text = "Type your password")},
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )


            Spacer(modifier = Modifier.height(20.dp))

            TextField(value = age ,
                onValueChange = {email=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(2.dp, Color.Yellow),
                label = { Text(text = "Age")},
                placeholder = { Text(text = "Enter your age")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)


            )
        }

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, mContext)
            xyz.signup(email.text.trim(),password.text.trim())
        },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier.width(300.dp),
            shape = CutCornerShape(5.dp)) {
            Text(text = "Register")
        }

        Text(text = "Have account? Login",
            modifier = Modifier.clickable {
                navController.navigate(ROUT_LOGIN)
            },
            fontSize = 15.sp)


        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "By signing in you agree to the terms as service and privacy policy and represent you are 21 0r older",
            color = Color.Black,
            modifier = Modifier
                .padding(start = 40.dp, end = 30.dp)
        )

    }
}


@Preview(showBackground= true)
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}

