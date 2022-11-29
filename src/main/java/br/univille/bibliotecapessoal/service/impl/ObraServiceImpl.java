package br.univille.bibliotecapessoal.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.bibliotecapessoal.dto.ObraDto;
import br.univille.bibliotecapessoal.entity.Obra;
import br.univille.bibliotecapessoal.mapper.ObraMapper;
import br.univille.bibliotecapessoal.repository.ObraRepository;
import br.univille.bibliotecapessoal.service.ObraService;

@Service
public class ObraServiceImpl implements ObraService{

    @Autowired
    private ObraRepository repository;
    
    private ObraMapper mapper
        = Mappers.getMapper(ObraMapper.class);

    
    @Override
    public List<ObraDto> getAll() {    
        return mapper.mapObra(repository.findAll());
    }

    @Override
    public ObraDto save(ObraDto obra) {
        Obra obraEntity = mapper.mapObraDto(obra);
        repository.save(obraEntity);
        return mapper.mapObra(obraEntity);
    }


    @Override
    public ObraDto findById(long id){
        Optional<Obra> obra = repository.findById(id);
        if(obra.isPresent()){
            Obra obraEntity = obra.get();
            return mapper.mapObra(obraEntity);
        }
        return new ObraDto();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }
    
}
