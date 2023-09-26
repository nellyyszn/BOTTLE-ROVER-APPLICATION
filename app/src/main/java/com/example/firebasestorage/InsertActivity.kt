package com.example.firebasestorage

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

class InsertActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firebaseUI()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun firebaseUI() {
    val context= LocalContext.current
    val storename = remember { mutableStateOf("") }
    val storeno = remember { mutableStateOf("") }
    val location = remember { mutableStateOf("") }
    val contactinfo = remember { mutableStateOf("") }
    val emailaddress = remember { mutableStateOf("") }
    val category = remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(Color.White),
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
           Text(
               text = "Store Information",
               fontSize = 25.sp,
               color = Color.Black,
               fontWeight = FontWeight.Bold,
               fontFamily = FontFamily.Serif
           )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            TextField(
                value = storename.value,
                onValueChange = { storename.value = it },
                placeholder = { Text(text = "Enter your store name") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = storeno.value,
                onValueChange = { storeno.value = it },
                placeholder = { Text(text = "Enter your store no") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = location.value,
                onValueChange = { location.value = it },
                placeholder = { Text(text = "Enter location") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = contactinfo.value,
                onValueChange = { contactinfo.value = it },
                placeholder = { Text(text = "Contact") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = emailaddress.value,
                onValueChange = { emailaddress.value = it },
                placeholder = { Text(text = "Type email address..") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = category.value,
                onValueChange = { category.value = it },
                placeholder = { Text(text = "Category") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    if (TextUtils.isEmpty(storename.value.toString())) {
                        Toast.makeText(context, "Please enter store name", Toast.LENGTH_SHORT)
                            .show()
                    } else if (TextUtils.isEmpty(storeno.value.toString())) {
                        Toast.makeText(context, "Please enter store no", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else if (TextUtils.isEmpty(contactinfo.value.toString())) {
                        Toast.makeText(context, "Please enter contactinfo", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else if (TextUtils.isEmpty(emailaddress.value.toString())) {
                        Toast.makeText(context, "Please enter email address", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else if (TextUtils.isEmpty(category.value.toString())) {
                        Toast.makeText(context, "Please enter category", Toast.LENGTH_SHORT)
                            .show()
                    }else if (TextUtils.isEmpty(location.value.toString())) {
                        Toast.makeText(
                            context,
                            "Please enter loaction",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else {
                        addDataToFirebase(
                            storename.value, storeno.value, location.value,contactinfo.value, emailaddress.value,category.value,context
                        )
                    }
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                shape = CutCornerShape(5.dp)
            ) {

                Text(text = "Add Store", modifier = Modifier.padding(8.dp), color = Color.Black)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    context.startActivity(Intent(context,DetailsActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                shape = CutCornerShape(5.dp)
            ) {
                Text(text = "Available Stores", modifier = Modifier.padding(8.dp), color = Color.Black)
            }
        }
    }
}

fun addDataToFirebase(StoreName: String,StoreNo: String, Location: String,ContactInfo: String,EmailAddress: String,Category: String,
                      context: Context
) {
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    val dbCourses: CollectionReference = db.collection("Stores")
    val Store = Store(StoreName, StoreNo,Location,ContactInfo,EmailAddress,Category)
    dbCourses.add(Store).addOnSuccessListener {
        Toast.makeText(context, "Your Store has been added successfully", Toast.LENGTH_SHORT).show()

    }.addOnFailureListener { e ->
        Toast.makeText(context, "Fail to add store", Toast.LENGTH_SHORT).show()
    }

}

@Preview(showBackground = true)
@Composable
fun FirebaseUiPreview() {
    firebaseUI()
}