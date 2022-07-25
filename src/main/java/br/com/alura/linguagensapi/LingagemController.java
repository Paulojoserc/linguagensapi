package br.com.alura.linguagensapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LingagemController {

    @GetMapping(value = "/linguagem-preferida")
    public String processaLinguagemPreferida() {
        return "Oi, Java!";
    }
}
