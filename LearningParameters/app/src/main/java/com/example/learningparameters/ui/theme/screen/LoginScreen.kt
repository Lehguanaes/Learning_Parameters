package com.example.learningparameters.ui.theme.screen

// 1° Página do projeto a ser codada

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.learningparameters.R
import com.example.learningparameters.ui.theme.LearningParametersTheme
import com.example.learningparameters.ui.theme.Purple
import com.example.learningparameters.ui.theme.Rose

// Anotação usada para permitir o uso de API's inacabadas/testes
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header (Login) sem borda e preenchendo toda a largura
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Purple, Rose)
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(id = R.drawable.moranguinho),
                contentDescription = "Imagem de perfil",
                modifier = Modifier
                    .size(190.dp)
                    .padding(8.dp) // Padding interno para espaçamento
            )

            // Campo de entrada e botão dentro da Row com padding
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp), // Padding aplicado apenas à Row
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = { Text("Digite o nome de usuário:") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedBorderColor = Purple,
                            unfocusedBorderColor = Color.Gray,
                            cursorColor = Purple,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        )
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            val name = text.ifEmpty { "Cara" }
                            navController.navigate("home/$name")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Purple
                        )
                    ) {
                        Text(
                            text = "Navegar para a Home",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f)) // Empurra o rodapé para baixo

            // Rodapé
            Column(
                modifier = Modifier
                    .fillMaxWidth() // Preenche toda a largura
                    .height(50.dp) // Define a altura do rodapé
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple, // Cor roxa
                                Rose    // Cor rosa
                            )
                        )
                    ),
                verticalArrangement = Arrangement.Center, // Centraliza o conteúdo verticalmente
                horizontalAlignment = Alignment.CenterHorizontally // Centraliza o conteúdo horizontalmente
            ) {
                // Texto do Copyright
                Text(
                    text = "© 2025 | Letícia Guanaes Moreira",
                    color = Color.White, // Cor do texto
                    fontSize = 16.sp, // Tamanho da fonte
                    fontWeight = FontWeight.Bold, // Deixa o texto em negrito
                    textAlign = TextAlign.Center // Centraliza o texto
                )
                // Texto de Direitos Reservados
                Text(
                    text = "Todos os direitos reservados.",
                    color = Color.White, // Cor do texto
                    fontSize = 16.sp, // Tamanho da fonte
                    fontWeight = FontWeight.Bold, // Deixa o texto em negrito
                    textAlign = TextAlign.Center // Centraliza o texto
                )
            }
        }
    }
}

// Parte do preview
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LearningParametersTheme {
        LoginScreen(
            navController = rememberNavController()
        )
    }
}