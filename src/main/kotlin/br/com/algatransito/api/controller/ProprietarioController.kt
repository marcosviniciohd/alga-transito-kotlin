package br.com.algatransito.api.controller

import br.com.algatransito.api.domain.model.Proprietario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/proprietarios")
class ProprietarioController {

    @GetMapping
    fun listarProprietarios(): List<Proprietario> {
        val proprietario1 = Proprietario(
            id = 1L,
            nome = "João da Silva",
            email = "joao.silva@outlook.com",
            telefone = "349999-5959"
        )
        val proprietario2 = Proprietario(
            id = 2L,
            nome = "Pedro da Silva",
            email = "pedro.silva@gmail.com",
            telefone = "349999-9595"
        )

        return listOf(proprietario1, proprietario2)
    }
}