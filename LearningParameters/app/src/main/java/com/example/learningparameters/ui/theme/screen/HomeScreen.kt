package com.example.learningparameters.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.learningparameters.R
import com.example.learningparameters.ui.theme.LearningParametersTheme
import com.example.learningparameters.ui.theme.Purple
import com.example.learningparameters.ui.theme.Rose


// 2° Página do projeto

/*
 * Irá receber os parametros da página de login
 * e fazer a compração (variável "name") dentro da
 * HomeRoute.kt para a autenticação dos usuários
*/
@Composable
fun HomeScreen(user: com.example.learningparameters.data.User) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header (Login) com gradiente
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
                    text = "Home",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            // Espaçamento entre o Header e o conteúdo
            Spacer(modifier = Modifier.height(40.dp))

            // Imagem de perfil
            Image(
                painter = painterResource(id = R.drawable.icone),
                contentDescription = "Imagem de perfil",
                modifier = Modifier
                    .size(120.dp)
                    .padding(8.dp) // Padding para espaçamento
            )

            // Saudação ao usuário
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Olá, ${user.name}!",
                fontSize = 22.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )

            // Bio do usuário com formatação centralizada
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "\" ${user.bio} \"",
                fontSize = 16.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .padding(horizontal = 24.dp),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic, // Adiciona itálico para a bio
                color = Color.Gray // Cor mais suave para a bio
            )

            // Informações do usuário
            Spacer(modifier = Modifier.height(16.dp))
            InfoText(label = "E-mail", value = user.email)
            InfoText(label = "Turma", value = user.turma)
            InfoText(label = "Data de Nascimento", value = user.registerDate)
            InfoText(label = "Pontuação", value = user.score.toString())
            InfoText(label = "Idade", value = user.age.toString())

            // Espaçamento flexível para empurrar o rodapé para o final
            Spacer(modifier = Modifier.weight(1f))

            // Rodapé
            Footer()
        }
    }
}

// Componente para exibir as informações do usuário
@Composable
fun InfoText(label: String, value: String) {
    Text(
        text = "$label: $value",
        fontSize = 16.sp,
        fontFamily = FontFamily.Serif,
        modifier = Modifier.padding(top = 12.dp),
        fontWeight = FontWeight.Medium, // Ajusta o peso da fonte para melhor leitura
        color = Color.Black
    )
}

// Rodapé estilizado
@Composable
fun Footer() {
    Column(
        modifier = Modifier
            .fillMaxWidth() // Preenche toda a largura
            .height(80.dp) // Define a altura do rodapé
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Purple, Rose) // Gradiente de roxo para rosa
                )
            )
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)), // Bordas arredondadas
        verticalArrangement = Arrangement.Center, // Centraliza o conteúdo verticalmente
        horizontalAlignment = Alignment.CenterHorizontally // Centraliza o conteúdo horizontalmente
    ) {
        // Texto de copyright
        Text(
            text = "© 2025 | Letícia Guanaes Moreira",
            color = Color.White, // Cor do texto
            fontSize = 16.sp, // Tamanho da fonte
            fontWeight = FontWeight.Bold, // Deixa o texto em negrito
            textAlign = TextAlign.Center // Centraliza o texto
        )

        // Texto de direitos reservados
        Text(
            text = "Todos os direitos reservados.",
            color = Color.White, // Cor do texto
            fontSize = 14.sp, // Tamanho da fonte ajustado para a segunda linha
            fontWeight = FontWeight.Medium, // Peso da fonte para suavizar
            textAlign = TextAlign.Center // Centraliza o texto
        )
    }
}
