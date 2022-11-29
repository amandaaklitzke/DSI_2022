package br.univille.bibliotecapessoal.service;
import br.univille.bibliotecapessoal.dto.AutorDto;
import java.util.List;

public interface AutorService {
    public List<AutorDto> getAll();
    public AutorDto save(AutorDto autor);
    public AutorDto findById(long id);
    public void delete(long id);   
}
