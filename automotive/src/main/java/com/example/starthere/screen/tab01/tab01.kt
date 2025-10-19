package com.example.starthere.screen.tab01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Composable
fun Tab01() {
    var r_r by remember { mutableFloatStateOf(0f) }
    var r_g by remember { mutableFloatStateOf(0f) }
    var r_b by remember { mutableFloatStateOf(0f) }
    var g_r by remember { mutableFloatStateOf(0f) }
    var g_g by remember { mutableFloatStateOf(0f) }
    var g_b by remember { mutableFloatStateOf(0f) }
    var b_r by remember { mutableFloatStateOf(0f) }
    var b_g by remember { mutableFloatStateOf(0f) }
    var b_b by remember { mutableFloatStateOf(0f) }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Column (
            modifier = Modifier
                .weight(2f)
        ) {
            HorizontalDivider(thickness = 1.dp)

            // Red (red)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "RED (red)", color = Color.Red)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
//                    val test = SliderColors(
//                        activeTrackColor = Color.Red,
//                        activeTickColor = Color.Red,
//                        inactiveTrackColor = Color.Red,
//                        inactiveTickColor = Color.Red,
//                        disabledThumbColor = Color.Red,
//                        disabledActiveTrackColor = Color.Red,
//                        disabledActiveTickColor = Color.Red,
//                        disabledInactiveTrackColor = Color.Red,
//                        disabledInactiveTickColor = Color.Red
//                    )

                    Slider(
                        value = r_r,
                        onValueChange = { r_r = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = r_r.toString(), color = Color.White)
                }
            }

            // Red (green)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "RED (green)", color = Color.Red)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = r_g,
                        onValueChange = { r_g = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = r_g.toString(), color = Color.White)
                }
            }

            // Red (blue)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "RED (blue)", color = Color.Red)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = r_b,
                        onValueChange = { r_b = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = r_b.toString(), color = Color.White)
                }
            }

            HorizontalDivider(thickness = 1.dp)

            // Green (red)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "GREEN (red)", color = Color.Green)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = g_r,
                        onValueChange = { g_r = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = g_r.toString(), color = Color.White)
                }
            }

            // Green (green)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "GREEN (green)", color = Color.Green)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = g_g,
                        onValueChange = { g_g = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = g_g.toString(), color = Color.White)
                }
            }

            // Green (blue)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "GREEN (blue)", color = Color.Green)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = g_b,
                        onValueChange = { g_b = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = g_b.toString(), color = Color.White)
                }
            }
            HorizontalDivider(thickness = 1.dp)

            // Blue (red)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "BLUE (red)", color = Color.Blue)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = b_r,
                        onValueChange = { b_r = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = b_r.toString(), color = Color.White)
                }
            }

            // Blue (green)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "BLUE (green)", color = Color.Blue)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = b_g,
                        onValueChange = { b_g = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = b_g.toString(), color = Color.White)
                }
            }

            // Blue (blue)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "BLUE (blue)", color = Color.Blue)
                }
                Column(
                    modifier = Modifier
                        .weight(5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Slider(
                        value = b_b,
                        onValueChange = { b_b = it }
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = b_b.toString(), color = Color.White)
                }
            }
            HorizontalDivider(thickness = 1.dp)
        }
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=1408dp,height=792dp,dpi=160",
    name = "AAOS 1024x768 Preview"
)
@Composable
fun PreviewInfoScreen() {
    Tab01()
}
