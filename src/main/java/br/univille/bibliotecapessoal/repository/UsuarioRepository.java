package br.univille.bibliotecapessoal.repository;

import br.univille.bibliotecapessoal.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository 
    extends JpaRepository<Usuario,Long>{
    //select * from usuario where usuario.usuario = 'zezinho'
    Usuario findByUsuario(String usuario);
    //select * from usuario where 
    //usuario.usuario = "zezinho" and usuario.senha = "1234"
    Usuario findByUsuarioAndSenha(String usuario, String senha);
}
