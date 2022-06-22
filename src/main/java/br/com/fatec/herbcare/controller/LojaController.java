package br.com.fatec.herbcare.controller;

import br.com.fatec.herbcare.model.entities.Loja;
import br.com.fatec.herbcare.model.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Loja> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Loja findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
