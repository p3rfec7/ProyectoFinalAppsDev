package com.curso.android.app.practica.proyectofinalmigueltrujillo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.curso.android.app.practica.proyectofinalmigueltrujillo.ui.theme.ProyectoFinalMiguelTrujilloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoFinalMiguelTrujilloTheme {
                var text1 by remember { mutableStateOf("") }
                var text2 by remember { mutableStateOf("") }
                var result by remember { mutableStateOf("") }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = text1,
                        onValueChange = { text1 = it },
                        label = { Text("Texto 1") }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = text2,
                        onValueChange = { text2 = it },
                        label = { Text("Texto 2") }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        result = if (text1 == text2) "Iguales" else "Diferentes"
                    }) {
                        Text("Comparar")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(result)
                }
            }
        }
    }
}