package br.univille.bibliotecapessoal.dto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import org.springframework.format.annotation.DateTimeFormat;
import br.univille.bibliotecapessoal.entity.Papel;

public class UsuarioDto {

    private long id;
    private String usuario;
    private String senha;
    private String nome;
    private Date dataNascimento;
    private String email;
    private List<Papel> listaPapeis = new ArrayList<>();
    public List<Papel> getListaPapeis() {return listaPapeis;}
    public void setListaPapeis(List<Papel> listaPapeis) {this.listaPapeis = listaPapeis;}
    
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha; }

    public Date getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

}
