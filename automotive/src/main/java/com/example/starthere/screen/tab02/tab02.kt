package com.example.starthere.screen.tab02

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tab02() {
    val t = true
    val f = false
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
    )
    {
        Text("Speed: 999 km/h", fontSize = 20.sp, color = Color.White)
        Text("RPM: 1000", fontSize = 20.sp, color = Color.White)
        Text("Fuel: 79.65%", fontSize = 20.sp, color = Color.White)
        Text("Engine Temp: 89°C", fontSize = 20.sp, color = Color.White)
        Text("Odometer: 15002 km", fontSize = 20.sp, color = Color.White)
        Text("Gear: D", fontSize = 20.sp, color = Color.White)
        Text("Seatbelt: ${if (t) "ON" else "OFF"}", fontSize = 20.sp, color = Color.White)
        Text("Left Blinker: ${if (f) "ON" else "OFF"}", fontSize = 20.sp, color = Color.White)
        Text("Right Blinker: ${if (t) "ON" else "OFF"}", fontSize = 20.sp, color = Color.White)
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=1408dp,height=792dp,dpi=160",
    name = "AAOS 1024x768 Preview"
)
@Composable
fun PreviewInfoScreen() {
    Tab02()
}
