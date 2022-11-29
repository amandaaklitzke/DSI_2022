package br.univille.bibliotecapessoal.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.univille.bibliotecapessoal.dto.ObraDto;
import br.univille.bibliotecapessoal.entity.Obra;

@Mapper
public interface ObraMapper {
    List<ObraDto> mapObra(List<Obra> obra);
    List<Obra> mapObraDto(List<ObraDto> obra);
    ObraDto mapObra(Obra obra);
    Obra mapObraDto(ObraDto obra);
}
