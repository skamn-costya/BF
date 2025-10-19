package com.example.starthere.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.starthere.screen.tab01.Tab01
import com.example.starthere.screen.tab02.Tab02
import com.example.starthere.R

@Composable
fun RootScreen() {
    var currentScreen by remember { mutableStateOf("tab01") }

    Column {
        Row(
            modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = { currentScreen = "tab01" }) { Text("Tab01") }
            Button(onClick = { currentScreen = "tab02" }) { Text("Tab02") }
        }
        when (currentScreen) {
            "tab01" -> Tab01()
            "tab02" -> Tab02()
        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=1408dp,height=792dp,dpi=160",
    name = "AAOS 1408x792 Preview"
)
@Composable
fun PreviewRootScreen() {
    Tab01()
}
