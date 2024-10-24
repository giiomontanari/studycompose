package com.example.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
        CustomText(text = "Primeira função composable")
    }

    @Composable
    private fun CustomText(text: String) {
        Text(text = text)
    }

    @Preview
    @Composable
    fun Preview() {
        SetupView()
    }
}
