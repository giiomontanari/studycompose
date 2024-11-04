package com.example.studycompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun InitialScreen() {
    var qtdClick by remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize()) {
        //content
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
            Text(
                text = "Quantidades de cliques ${qtdClick}",
                fontSize = 20.sp,
                fontFamily = montSerratScriptFamily,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        SimpleButton() { qtdClick++ }
    }
}

@Composable
fun SimpleButton(onClick: () -> Unit) {
    Button(
        onClick = onClick
        , modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text("Confirmar", modifier = Modifier.padding(4.dp))
    }
}
