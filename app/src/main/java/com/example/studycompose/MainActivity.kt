package com.example.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SetupView()
            NotificationBage()
        }
    }

    @Composable
    private fun SetupView() {
        Column(Modifier.background(color = Color.Gray)) {
            CustomText(text = "Primeira função composable")
            Row {
                CustomText(text = "Seja bem vindo!!")
                CustomText(text = "Olá, usuário")
            }
        }
    }

    @Composable
    private fun CustomText(text: String) {
        Text(text = text, color = Color.White)
    }

    @Composable
    private fun NotificationBage() {
        Box(
            modifier = Modifier.padding(20.dp), contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(color = Color.Blue))
            Box(modifier = Modifier
                .size(8.dp)
                .clip(CircleShape)
                .background(color = Color.Red)
                .align(Alignment.TopEnd)
            )
        }
    }

    @Preview
    @Composable
    fun Preview() {
        SetupView()
        NotificationBage()
    }
}
