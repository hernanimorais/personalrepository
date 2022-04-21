package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message="Titulo não pode ser vazio")
    @field:Size(min= 5, max = 100, message="Titulo deve conter entre 5 e 100 caracteres") val titulo: String,
    @field:NotEmpty(message="Mensagem não pode ser vazio")
    @field:Size(min= 5, max = 100,  message="Mensagem deve conter entre 5 e 100 caracteres") val mensagem: String,
    @field:NotNull(message="idCurso não pode ser nulo") val idCurso: Long,
    @field:NotNull(message="idAutor não pode ser nulo") val idAutor: Long
)


