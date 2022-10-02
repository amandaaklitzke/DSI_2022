package br.univille.bibliotecapessoal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAutor;
    @Column(length = 500)
    private String nomeAutor;
    private String paisOrigem;
    @Temporal(value = TemporalType.DATE)
    private Date anoNascAutor;
    @Temporal(value = TemporalType.DATE)
    private Date anoFacelimentocAutor;

    public long getIdAutor() {
        return idAutor;
    }
    public void setIdAutor(long idAutor) {
        this.idAutor = idAutor;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public Date getAnoNascAutor() {
        return anoNascAutor;
    }
    public void setAnoNascAutor(Date anoNascAutor) {
        this.anoNascAutor = anoNascAutor;
    }
    public Date getAnoFacelimentocAutor() {
        return anoFacelimentocAutor;
    }
    public void setAnoFacelimentocAutor(Date anoFacelimentocAutor) {
        this.anoFacelimentocAutor = anoFacelimentocAutor;
    } 

}
