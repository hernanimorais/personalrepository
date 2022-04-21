package com.example.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Introspected // Fazer toda serialização para Json no tempo de compilação ao invés de ser em tempo de execução
data class Cliente(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? =null,
    val nome: String,
    val CPF: Long
)
