package br.com.fatec.herbcare.controller;

import br.com.fatec.herbcare.model.entities.Loja;
import br.com.fatec.herbcare.model.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lojas")
public class LojaController {

    @Autowired
    private LojaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Loja save(@RequestBody Loja entity){
        return service.save(entity);
    }
}