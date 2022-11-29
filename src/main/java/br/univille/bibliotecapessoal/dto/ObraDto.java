package br.univille.bibliotecapessoal.dto;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class ObraDto {
   
    private long idObra;
    private String obra; //titulo da obra
    private String subTitulo;
    @DateTimeFormat( pattern= "yyyy-MM-dd")
    private Date anoPublicacao;
    private String autor;
    private int quantPg; // quantidade de paginas
    private String sinopseObra;
    private String paisOrigemObra;
    private String tipoObra;
    private String generoObra;
    private String idiomaObra;
    private String status;

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    
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
    
}


    // private long idObra;
    // private long idAutor;
    // private long idGenero;
    // private long idNota;
    // private String obra;
    // private String tituloObra;
    // private String subTitulo;
    // private String autor;
    // @DateTimeFormat( pattern= "yyyy-MM-dd")
    // private Date anoPublicacao;
    // @DateTimeFormat( pattern= "yyyy-MM-dd")
    // private Date periodoInicialLeitura;
    // private Date periodoFinalLeitura;
    // private int quantPg; //quantidade de paginas
    // private String sinopseObra;
    // private String paisOrigemObra;
    // private int volumeObra;
    // private String capObra;