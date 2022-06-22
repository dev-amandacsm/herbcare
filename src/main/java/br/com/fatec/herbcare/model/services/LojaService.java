package br.com.fatec.herbcare.model.services;

import br.com.fatec.herbcare.model.entities.Loja;
import br.com.fatec.herbcare.model.repositories.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {

    @Autowired
    LojaRepository repository;

    public Loja save(Loja entity){
        return repository.save(entity);
    }
}
