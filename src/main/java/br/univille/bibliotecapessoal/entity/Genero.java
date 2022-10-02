package br.univille.bibliotecapessoal.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Genero {
    @Id
    private long idGenero;
    @Column(length = 500)
    private int nota;
    private String comentario;
    @Temporal(value = TemporalType.DATE)
    private Date dataNota;

    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
