package br.com.fatec.herbcare.repositories;

import br.com.fatec.herbcare.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Override
    List<Usuario> findAll();

    @Override
    Usuario save(Usuario entity);
}
