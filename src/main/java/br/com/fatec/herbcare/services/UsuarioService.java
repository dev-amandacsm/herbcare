package br.com.fatec.herbcare.services;

import br.com.fatec.herbcare.model.entities.Usuario;
import br.com.fatec.herbcare.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Usuario save(Usuario entity){
        return repository.save(entity);
    }
}
