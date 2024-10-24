package com.example.studycompose.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextField() {
    var text by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    isError = text.contains("0")

    OutlinedTextField(
        value = text,
        onValueChange = { newValue -> text = newValue },
        label = { Text("Nome") },
        isError = isError,
        textStyle = TextStyle(
            color = Color.Blue,
            fontFamily = montSerratScriptFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        ),
//        colors = TextFieldDefaults.outlinedTextFieldColors(cursorColor = Color.Green,
//            errorBorderColor = Color.Yellow,
//            errorCursorColor = Color.Yellow,
//            focusedBorderColor = Color.Red)
    )
}

@Preview
@Composable
fun PreviewTextField() {

}