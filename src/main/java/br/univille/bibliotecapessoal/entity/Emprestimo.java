package br.univille.bibliotecapessoal.entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;

@Entity
public class Emprestimo {
    @Id
    private int idEmprestimo;
    @Column(length = 500)
    private String nomeEmprestimo;
    //private int idObra; //id da obra de referencia
    @Temporal(value = TemporalType.DATE)
    private Date dataEmprestimo;
    
}

//ter a opção de aparecer na tela quantos dias ja esta emprestado