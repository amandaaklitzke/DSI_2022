package br.univille.bibliotecapessoal.service;
import java.util.List;
import br.univille.bibliotecapessoal.dto.UsuarioDto;
// import br.univille.bibliotecapessoal.entity.Usuario;


public interface UsuarioService {
    public List<UsuarioDto> getAll();
    public UsuarioDto save(UsuarioDto usuario);
    public UsuarioDto findById(long id);
    public void delete(long id);    
}
