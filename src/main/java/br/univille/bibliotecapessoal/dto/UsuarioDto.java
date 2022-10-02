package br.univille.bibliotecapessoal.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UsuarioDto {
    private String nome;
    private String sobrenome;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataCriacao;
    private String email;
    private long id;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
