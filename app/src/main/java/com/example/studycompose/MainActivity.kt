package com.example.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetupView()
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

    @Preview
    @Composable
    fun Preview() {
        SetupView()
    }
}
