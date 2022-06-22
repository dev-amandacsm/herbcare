package br.com.fatec.herbcare.controller;

import br.com.fatec.herbcare.model.entities.Usuario;
import br.com.fatec.herbcare.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario entity){
        return service.save(entity);
    }
}
