package br.univille.bibliotecapessoal.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Genero {
    @Id
    private long idGenero;
    @Column(length = 500)
    private String genero;
    
    // private int nota; 
    // private String comentario;
    // @Temporal(value = TemporalType.DATE)
    // private Date dataNota;

    
}
