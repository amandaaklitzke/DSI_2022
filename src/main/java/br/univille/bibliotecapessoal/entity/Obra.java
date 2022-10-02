package br.univille.bibliotecapessoal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Obra {
    @Id
    private long idObra;

    private String obra;
    private String tituloObra;
    private String subTitulo;
    private String autor;
    @Temporal(value = TemporalType.DATE)
    private Date anoPublicacao;
    @Temporal(value = TemporalType.DATE)
    private Date periodoInicialLeitura;
    @Temporal(value = TemporalType.DATE)
    private Date periodoFinalLeitura;
    private int quantPg; // quantidade de paginas

    @Column(length = 500)
    private String sinopseObra;
    private String paisOrigemObra;
    private int volumeObra;
    private String capObra;

    public long getIdObra() {
        return idObra;
    }

    public void setIdObra(long idObra) {
        this.idObra = idObra;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Date getPeriodoInicialLeitura() {
        return periodoInicialLeitura;
    }

    public void setPeriodoInicialLeitura(Date periodoInicialLeitura) {
        this.periodoInicialLeitura = periodoInicialLeitura;
    }

    public Date getPeriodoFinalLeitura() {
        return periodoFinalLeitura;
    }

    public void setPeriodoFinalLeitura(Date periodoFinalLeitura) {
        this.periodoFinalLeitura = periodoFinalLeitura;
    }

    public int getQuantPg() {
        return quantPg;
    }

    public void setQuantPg(int quantPg) {
        this.quantPg = quantPg;
    }

    public String getSinopseObra() {
        return sinopseObra;
    }

    public void setSinopseObra(String sinopseObra) {
        this.sinopseObra = sinopseObra;
    }

    public String getPaisOrigemObra() {
        return paisOrigemObra;
    }

    public void setPaisOrigemObra(String paisOrigemObra) {
        this.paisOrigemObra = paisOrigemObra;
    }

    public int getVolumeObra() {
        return volumeObra;
    }

    public void setVolumeObra(int volumeObra) {
        this.volumeObra = volumeObra;
    }

    public String getCapObra() {
        return capObra;
    }

    public void setCapObra(String capObra) {
        this.capObra = capObra;
    }

}
