package com.example.firebasestorage.screens.recipe

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_HOME


@Composable
fun RecipeScreen(navController: NavController) {
    val mContext = LocalContext.current
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Recipes",)
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_HOME)
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "arrowback")
                }
            },
            backgroundColor = Color.Yellow)
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
            placeholder = { Text(text = "Search....") }
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
                            text = "CONQUILLA CAVA BRUT ROSE",
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "WOODBRIDGE CHARDONNAY ",
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "", modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "SEGURA VIUDAS BRUT ROSE",
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
                            text = "MATUA MARLBOROUGH SAUVIGNON BLANC",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "JOSH CELLARS ROSE ",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "STOLICHNAYA CHAMOY",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "REDBREAST IRISH WHISKEY ",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
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
                            text = "KHORTYTSA ICE VODKA",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
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
                            text = "DOM JULIO ROSADO REPOSADO ",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "DOM JULIO ROSADO REPOSADO",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "TITO'S HANDMADE VODKA ",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "CROWN ROYAL ",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "FIREBALL CINNAMOM WHISKY",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "SVEDKA VODKA",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "STOLICHNAYA CHAMOY",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "TEARS OF LLORONA",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "PIERRE FARRANDDRY CURACAO ORANGE LIQUEUR",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

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
                            text = "MARCA LUMINOR PROSECCO DOGG",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "MEIOMI PINOT NIOR",
                            fontSize =15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                        text = "JOSH CELLARS ROSE",
                        fontSize = 15.sp,
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
                            text = "CHATEU STE.MICHELLE CHARDONNAY",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize =15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .align(BottomEnd)
                        .padding(end = 25.dp, bottom = 25.dp)
                )
            }
        }
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
                            text = "WHITE CLAW VERIETY PACK FLAVOR",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "GUINESS DRAUGHT",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "GUINESS EXTRA STOUT",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "SHINER BOCK",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            text = "MEDOLA ESPECIAL",
                            fontSize = 15.sp,
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
                            text = "CORONA LIGHT BEER",
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                            fontSize = 15.sp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
                    imageVector = Icons.Filled.ThumbUp,
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
fun RecipeScreenPreview(){
    RecipeScreen(rememberNavController())

}