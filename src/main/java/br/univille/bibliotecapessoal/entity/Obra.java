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
    @Column(length = 200)
    private String obra; //titulo da obra
    @Column(length = 200)
    private String subTitulo;
    @Temporal(value = TemporalType.DATE)
    private Date anoPublicacao;
    private String autor;
    private int quantPg; // quantidade de paginas
    @Column(length = 500)
    private String sinopseObra;
    private String paisOrigemObra;
    private String tipoObra;
    private String generoObra;
    private String idiomaObra;
    private String status;

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    // @Temporal(value = TemporalType.DATE)
    // private Date periodoInicialLeitura;
    // @Temporal(value = TemporalType.DATE)
    // private Date periodoFinalLeitura;  
    // private int volumeObra;
    // private String capObra;

    public String getIdiomaObra() {return idiomaObra;}
    public void setIdiomaObra(String idiomaObra) {this.idiomaObra = idiomaObra;}

    public String getTipoObra() {return tipoObra;}
    public void setTipoObra(String tipoObra) {this.tipoObra = tipoObra;}

    public String getGeneroObra() {return generoObra;}
    public void setGeneroObra(String generoObra) {this.generoObra = generoObra;}
    
    public long getIdObra() { return idObra;}
    public void setIdObra(long idObra) {this.idObra = idObra;}

    public String getObra() { return obra;}
    public void setObra(String obra) {this.obra = obra;}

    public String getSubTitulo() {return subTitulo;}
    public void setSubTitulo(String subTitulo) {this.subTitulo = subTitulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public Date getAnoPublicacao() {return anoPublicacao;}
    public void setAnoPublicacao(Date anoPublicacao) {this.anoPublicacao = anoPublicacao;}

    public int getQuantPg() {return quantPg;}
    public void setQuantPg(int quantPg) {this.quantPg = quantPg;}

    public String getSinopseObra() {return sinopseObra;}
    public void setSinopseObra(String sinopseObra) {this.sinopseObra = sinopseObra;}

    public String getPaisOrigemObra() {return paisOrigemObra;}
    public void setPaisOrigemObra(String paisOrigemObra) { this.paisOrigemObra = paisOrigemObra; }

    // public Date getPeriodoInicialLeitura() {
    //     return periodoInicialLeitura;
    // }

    // public void setPeriodoInicialLeitura(Date periodoInicialLeitura) {
    //     this.periodoInicialLeitura = periodoInicialLeitura;
    // }

    // public Date getPeriodoFinalLeitura() {
    //     return periodoFinalLeitura;
    // }

    // public void setPeriodoFinalLeitura(Date periodoFinalLeitura) {
    //     this.periodoFinalLeitura = periodoFinalLeitura;
    // }

    // public int getVolumeObra() { return volumeObra;}
    // public void setVolumeObra(int volumeObra) {this.volumeObra = volumeObra;}

    // public String getCapObra() {return capObra;}
    // public void setCapObra(String capObra) {this.capObra = capObra;}

}
