package br.univille.bibliotecapessoal.service;
import java.util.List;
import br.univille.bibliotecapessoal.dto.ObraDto;
// import br.univille.bibliotecapessoal.entity.Obra;


public interface ObraService {
    public List<ObraDto> getAll();
    public ObraDto save(ObraDto obra);
    public ObraDto findById(long id);
    public void delete(long id);    
}
