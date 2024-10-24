package com.example.studycompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studycompose.R

@Preview
@Composable
fun Preview() {
    TextShadow()
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
private fun TextShadow() {
    val offset = Offset(5f, 5f)
    Text(
        text = stringResource(id = R.string.hello_world), style = TextStyle(
            fontSize = 24.sp,
            color = Color.Cyan,
            shadow = Shadow(color = Color.Blue, offset = offset)
        )
    )
}