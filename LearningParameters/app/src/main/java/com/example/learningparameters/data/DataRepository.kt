package com.example.learningparameters.data

val userDefault = User(
    userId = "Aluno",
    name = "Aluno DS",
    avatarUrl = null,
    age = 17,
    score = 75,
    turma = "3° AMS",
    registerDate = "24/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Sou estudante de Desenvolvimento de Sistemas na ETEC Zona Leste que criou um aplicativo com passagem de parâmetros no JetPackCompose."
)

val Leticia = User(
    userId = "Leticia",
    name = "Letícia Guanaes Moreira",
    avatarUrl = null,
    age = 17,
    score = 100,
    turma = "3° AMS",
    registerDate = "11/06/2007",
    email = "leticia.moreira66@etec.sp.gov.br",
    bio = "Sou estudante de Desenvolvimento de Sistemas na ETEC Zona Leste e desenvolvi um aplicativo utilizando passagem de parâmetros com Jetpack Compose."

)

fun getUserData(userName: String): User {
    return if (userName == "Leticia") {
        Leticia
    } else {
        userDefault
    }
}