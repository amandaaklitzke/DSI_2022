package br.univille.bibliotecapessoal.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.bibliotecapessoal.dto.AutorDto;
import br.univille.bibliotecapessoal.entity.Autor;
import br.univille.bibliotecapessoal.mapper.AutorMapper;
import br.univille.bibliotecapessoal.repository.AutorRepository;
import br.univille.bibliotecapessoal.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

    @Autowired
    private AutorRepository repository;
    
    private AutorMapper mapper
        = Mappers.getMapper(AutorMapper.class);

    
    @Override
    public List<AutorDto> getAll() {    
        return mapper.mapAutor(repository.findAll());
    }

    @Override
    public AutorDto save(AutorDto autor) {
        Autor autorEntity = mapper.mapAutorDto(autor);
        repository.save(autorEntity);
        return mapper.mapAutor(autorEntity);
    }


    @Override
    public AutorDto findById(long id){
        Optional<Autor> autor = repository.findById(id);
        if(autor.isPresent()){
            Autor autorEntity = autor.get();
            return mapper.mapAutor(autorEntity);
        }
        return new AutorDto();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }
    
}
