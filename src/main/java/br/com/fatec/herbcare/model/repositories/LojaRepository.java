package br.com.fatec.herbcare.model.repositories;

import br.com.fatec.herbcare.model.entities.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer> {

    Loja save(Loja entity);

    List<Loja> findAll();

}
