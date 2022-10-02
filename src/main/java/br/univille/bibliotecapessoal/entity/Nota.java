package br.univille.bibliotecapessoal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Nota {
    @Id
    private long idNota;
    @Column(length = 500)
    private int nota;
    @Column(length = 500)
    private String comentario;
    @Temporal(value = TemporalType.DATE)
    private Date dataNota;

}
