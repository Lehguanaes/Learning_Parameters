package com.example.learningparameters.data

data class User (
    val userId: String,
    val name: String,
    val email: String,
    val bio: String,
    val registerDate: String,
    val score: Int,
    val age: Int,
    val turma: String,
    val avatarUrl: String?
)