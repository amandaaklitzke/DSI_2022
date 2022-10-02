package br.univille.bibliotecapessoal.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.bibliotecapessoal.dto.UsuarioDto;
import br.univille.bibliotecapessoal.entity.Usuario;
import br.univille.bibliotecapessoal.mapper.UsuarioMapper;
import br.univille.bibliotecapessoal.repository.UsuarioRepository;
import br.univille.bibliotecapessoal.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository repository;
    
    private UsuarioMapper mapper
        = Mappers.getMapper(UsuarioMapper.class);

    
    @Override
    public List<UsuarioDto> getAll() {    
        return mapper.mapUsuario(repository.findAll());
    }

    @Override
    public UsuarioDto save(UsuarioDto usuario) {
        Usuario usuarioEntity = mapper.mapUsuarioDto(usuario);
        repository.save(usuarioEntity);
        return mapper.mapUsuario(usuarioEntity);
    }


    @Override
    public UsuarioDto findById(long id){
        Optional<Usuario> usuario = repository.findById(id);
        if(usuario.isPresent()){
            Usuario usuarioEntity = usuario.get();
            return mapper.mapUsuario(usuarioEntity);
        }
        return new UsuarioDto();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }
    
}
