package br.com.gustavocampos.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/primeiraRota")
public class MeuPrimeiroController {

    /*
     * Métodos de req HTTP
     * GET - Obter info
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */

    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }

}
