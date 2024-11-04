package com.example.studycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studycompose.components.InitialScreen
import com.example.studycompose.components.SimpleTextField
import com.example.studycompose.components.TextShadow

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SetupView()
//            NotificationBage()
//            TextShadow()
//            SimpleTextField()
            InitialScreen()
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
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(color = Color.Blue)
            )
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(color = Color.Red)
                    .align(Alignment.TopEnd)
            )
        }
    }

    @Composable
    private fun MessageCard() {
        Row(
            modifier = Modifier.padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "foto do contato",
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Autor da mensagem")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Conteúdo da mensagem")
            }
        }
    }

    @Composable
    private fun TestModifier() {
        Column {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, color = Color.Gray))
                    .padding(horizontal = 8.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Item 2",
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, color = Color.Blue))
                    .padding(horizontal = 4.dp, vertical = 4.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Item 3",
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, color = Color.Red))
                    .padding(8.dp)
            )
        }
    }

    @Composable
    private fun TestButton() {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Confirmar")
        }
    }

    @Preview
    @Composable
    fun Preview() {
        TestButton()
    }
}
