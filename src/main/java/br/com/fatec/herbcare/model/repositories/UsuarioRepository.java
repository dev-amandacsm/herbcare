package br.com.fatec.herbcare.model.repositories;

import br.com.fatec.herbcare.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Override
    List<Usuario> findAll();

    @Override
    Usuario save(Usuario entity);

    @Override
    Optional<Usuario> findById(Integer id);
}
