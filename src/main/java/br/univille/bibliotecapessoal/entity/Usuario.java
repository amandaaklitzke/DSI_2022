package br.univille.bibliotecapessoal.entity;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100)
    private String usuario;
    private String senha;
    @Column(length = 100)
    private String nome;
    @Temporal(value = TemporalType.DATE)
    private Date dataNascimento;
    private String email;
    @OneToMany(fetch = FetchType.EAGER)
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
