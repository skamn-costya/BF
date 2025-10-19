package com.example.starthere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import kotlinx.coroutines.delay
import kotlin.random.Random
import androidx.compose.runtime.*
import com.example.starthere.screen.RootScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // корутина, которая эмулирует данные
//            LaunchedEffect(Unit) {
//                var tick = 0
//                while (true) {
//                    tick++
//                    delay(700)
//                }
//            }
            RootScreen()
        }
    }
}