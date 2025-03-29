package com.example.learningparameters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.learningparameters.ui.theme.LearningParametersTheme

// Importada a classe criada para a navegação manualmente
import com.example.learningparameters.navigation.SetupNavGraph


// Classe apenas para execução do projeto
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningParametersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Criar função para navegação do aplicativo
                    SetupNavGraph(navController = rememberNavController())
                }
            }
        }
    }
}

