package br.univille.bibliotecapessoal.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import br.univille.bibliotecapessoal.dto.AutorDto;
import br.univille.bibliotecapessoal.entity.Autor;

@Mapper
public interface AutorMapper {
    List<AutorDto> mapAutor(List<Autor> autor);
    List<Autor> mapAutorDto(List<AutorDto> autor);
    AutorDto mapAutor(Autor autor);
    Autor mapAutorDto(AutorDto autor);
}
