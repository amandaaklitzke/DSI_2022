package br.univille.bibliotecapessoal.repository;

import br.univille.bibliotecapessoal.entity.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraRepository
        extends JpaRepository<Obra, Long> {

}
