package br.univille.bibliotecapessoal.entity;

//import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Column;

public class TipoObra {
    @Id
    private long idTipoObra; // >>>>>>>>>>>Apenas um check ao tipo de obra como manga, livro, hq
    @Column(length = 500)
    private String nomeTipoObra;

    public String getNomeTipoObra() {
        return nomeTipoObra;
    }

    public void setNomeTipoObra(String nomeTipoObra) {
        this.nomeTipoObra = nomeTipoObra;
    }
}
