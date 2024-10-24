package com.example.studycompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.studycompose.R

@Preview
@Composable
fun Preview() {
    FontsDifferents()
}

@Composable
fun SimpleText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.hello_world),
            color = Color.Gray,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun TextShadow() {
    val offset = Offset(5f, 5f)
    Text(
        text = stringResource(id = R.string.hello_world), style = TextStyle(
            fontSize = 24.sp,
            color = Color.Cyan,
            shadow = Shadow(color = Color.Blue, offset = offset, blurRadius = 5f)
        )
    )
}

val montSerratScriptFamily = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_semibold, FontWeight.SemiBold),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

@Composable
fun FontsDifferents() {
    Column(modifier = Modifier.background(color = Color.White)) {
        Text(
            text = "Font Regular", fontFamily = montSerratScriptFamily, fontWeight = FontWeight.Normal
        )
        Text(
            text = "Font Medium", fontFamily = montSerratScriptFamily, fontWeight = FontWeight.Medium
        )
        Text(
            text = "Font Semibold", fontFamily = montSerratScriptFamily, fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Font Bold", fontFamily = montSerratScriptFamily, fontWeight = FontWeight.Bold
        )
    }
}