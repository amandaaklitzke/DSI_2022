package br.univille.bibliotecapessoal.dto;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class AutorDto {
    private long idAutor;
    private String nomeAutor;
    private String paisOrigem;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date anoNascAutor;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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
