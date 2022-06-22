package br.com.fatec.herbcare.model.services;

import br.com.fatec.herbcare.model.entities.Usuario;
import br.com.fatec.herbcare.model.exceptions.ObjectNotFoundException;
import br.com.fatec.herbcare.model.repositories.UsuarioRepository;
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

    public Usuario findById(Integer id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado. Verifique o id informado e tente novamente."));
    }

    public void deleteById(Integer id){
        Usuario entity = findById(id);
        repository.deleteById(entity.getId());
    }
}
