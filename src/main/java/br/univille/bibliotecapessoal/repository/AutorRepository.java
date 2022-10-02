package br.univille.bibliotecapessoal.repository;

import br.univille.bibliotecapessoal.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository
                extends JpaRepository<Autor, Long> {

}