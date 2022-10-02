package br.univille.bibliotecapessoal.repository;

import br.univille.bibliotecapessoal.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

}
