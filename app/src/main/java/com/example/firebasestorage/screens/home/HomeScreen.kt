package com.example.firebasestorage.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.firebasestorage.DetailsActivity
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_STORE

@Composable
fun HomeScreen(navController:NavController) {
    val mContext = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "HOME",
                    textAlign = TextAlign.Center
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_LOGIN)
                }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")
                }
            },
            actions = {
                IconButton(onClick = {
                    navController.navigate(ROUT_STORE)

                }) {
                    Icon(imageVector = Icons.Filled.Info, contentDescription = "cart")
                }

                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "cart")
                }
            },
            backgroundColor = Color.Yellow
        )
        Spacer(modifier = Modifier.height(20.dp))

       Row {
           OutlinedButton(onClick = {


           },
               modifier = Modifier
                   .padding(start = 10.dp)
                   .border(2.dp, Color.Black)
                   .width(120.dp),
               shape = RoundedCornerShape(5.dp)
           ) {
               Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription = "", tint = Color.Black)
               Text(text = "Recipe", color = Color.Black)

           }


           OutlinedButton(onClick = {
               mContext.startActivity(Intent(mContext,InsertActivity::class.java))
           },
               modifier = Modifier
                   .padding(start = 10.dp)
                   .border(2.dp, Color.Black),
               shape = CutCornerShape(5.dp)
           ) {
               Icon(imageVector = Icons.Filled.Add, contentDescription = "", tint = Color.Black)
               Text(text = "Add Store", color = Color.Black)

           }
           OutlinedButton(onClick = {
               mContext.startActivity(Intent(mContext,DetailsActivity::class.java))
           },
               modifier = Modifier
                   .padding(start = 10.dp)
                   .border(2.dp, Color.Black)
                   .width(120.dp),
               shape = CutCornerShape(5.dp)
           ) {
               Icon(imageVector = Icons.Filled.List, contentDescription = "", tint = Color.Black)
               Text(text = "View Stores", color = Color.Black)

           }
       }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        ) {

            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.first))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress, modifier = Modifier.fillMaxSize())
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "FEATURED PRODUCTS",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(50.dp)
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
        //Row 1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_40),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "CONQUILLA CAVA BRUT ROSE 750ML",
                            fontSize = 15.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ML(Standard)",
                            fontSize = 15.sp
                        )
                        Text(
                            text = "ksh.650",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_39),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "WOODBRIDGE CHARDONNAY 1.5 ML",
                            fontSize = 15.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "1.5L(Large)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.700",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {

                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_50),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "SEGURA VIUDAS BRUT ROSE 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "1.5mL(Large)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.1,000",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "MATUA MARLBOROUGH SAUVIGNON BLANC 750ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )

                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "JOSH CELLARS ROSE 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "STOLICHNAYA CHAMOY 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )

                    }
                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_11),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "REDBREAST IRISH WHISKEY LAUSTAU EDITION 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "KHORTYTSA ICE VODKA 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
        }
            Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "TOP SELLS",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(50.dp)
                .padding(5.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Shop top selling liqours",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        //Row 2
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)

                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "DOM JULIO ROSADO REPOSADO 750ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)

                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_44),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "CAPTAIN COLADA",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)

                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "DOM JULIO ROSADO REPOSADO 750ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_17),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "TITO'S HANDMADE VODKA 1.75L",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_18),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "CROWN ROYAL 1.75L",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }

                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_19),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "FIREBALL CINNAMOM WHISKY 1.75L",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.1500",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }

                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_20),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "SVEDKA VODKA  1.75L",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }

                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "STOLICHNAYA CHAMOY 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {

                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_12),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "TEARS OF LLORONA 1L",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_18),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "PIERRE FARRANDDRY CURACAO ORANGE LIQUEUR 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "750 ml(Standard)",
                            fontSize = 15.sp,
                        )
                        Text(
                            text = "ksh.950",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }

                }
                Icon(
                    imageVector = Icons.Default.Favorite,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
        }
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Shop top selling Wines",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            //Row 3
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_21),
                                contentDescription = "", modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "MARCA LUMINOR PROSECCO DOGG 750 ML",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_43),
                                contentDescription = "", modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "MEIOMI PINOT NIOR 750 ML",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Card(
                    modifier = Modifier
                        .size(230.dp)
                        .padding(10.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "JOSH CELLARS ROSE 750 ML",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_23),
                                contentDescription = "", modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "CHATEU STE.MICHELLE CHARDONNAY 2021 750 ML",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_16),
                                contentDescription = "", modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "WOODBRIDGE CHADDONAY",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_25),
                                contentDescription = "", modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "YELLOW TAIL CHADDONAY",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Shop top selling beers",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            //Row 4
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_26),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "WHITE CLAW",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )

                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_27),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "GUINESS DRAUGHT 6PK BOTTLES",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )

                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_28),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "GUINESS EXTRA STOUT 6PK BOTTLES",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )

                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_34),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "SHINER BOCK 6PK",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_30),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "MEDOLA ESPECIAL 6PK BTLS",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_32),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "CORONA LIGHT BEER 6PK BOTTLE",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_33),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "TRULY LEMONADE VARIETY PACK 12PK CANS",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_35),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "SIERRA NAVADA HAZY LITTLE THICK 6PK CANS",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))


                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_36),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "NEW BELGIUM VOODOO RANGER IMPERIAL IPA 6PK BTLS",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "750 ml(Standard)",
                                fontSize = 15.sp,
                            )
                            Text(
                                text = "ksh.950",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                        }
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Box {
                    Card(
                        modifier = Modifier
                            .size(230.dp)
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img_37),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(
                                text = "TRULY BERRY VARIETY PACK 12PK",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        tint = Color.Gray,
                        contentDescription = "",
                        modifier = Modifier
                            .align(BottomEnd)
                            .padding(end = 25.dp, bottom = 25.dp)
                    )
                }
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
