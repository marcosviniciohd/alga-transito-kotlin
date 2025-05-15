package br.com.algatransito.api.domain.model

data class Proprietario(
    val id: Long,
    val nome: String,
    val email: String,
    val telefone: String
)
