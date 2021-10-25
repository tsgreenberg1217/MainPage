package com.example.mainpage


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun DummyView(route: String) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(route)
    }
}

@Composable
fun DummyNavView(routeToGoTo: String, navAction: (String) -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navAction(routeToGoTo) }) {
                Text(text = "Go to $routeToGoTo", style = TextStyle(color = Color.White))
            }
        }
    }
}