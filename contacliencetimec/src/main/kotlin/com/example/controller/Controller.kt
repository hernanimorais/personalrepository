package com.example.controller

import com.example.model.Cliente
import com.example.repository.ClienteRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post


@Controller("/cliente")
class Controller(private val repository: ClienteRepository) {

    @Post
    fun addCliente(@Body cliente: Cliente): HttpResponse<Cliente> {
            return HttpResponse.created(repository.save(cliente))
    }

    @Get
    fun getCliente(): List<Cliente> {
        return repository.findAll()    }

}
