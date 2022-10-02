package br.univille.bibliotecapessoal.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import br.univille.bibliotecapessoal.dto.UsuarioDto;
import br.univille.bibliotecapessoal.entity.Usuario;

@Mapper
public interface UsuarioMapper {
    List<UsuarioDto> mapUsuario(List<Usuario> usuario);
    List<Usuario> mapUsuarioDto(List<UsuarioDto> usuario);
    UsuarioDto mapUsuario(Usuario usuario);
    Usuario mapUsuarioDto(UsuarioDto usuario);

}
