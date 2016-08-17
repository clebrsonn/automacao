package com.teccsoluction.sushi.entidade;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME_FANTASIA")
    private String nomefantasia;



    //CONSTRUTOR PADRAO

    public Empresa() {
        // TODO Auto-generated constructor stub
    }



    //GETTERS AND SETTERS

    public String getNome() {
        return nomefantasia;
    }


    public void setNome(String nome) {
        this.nomefantasia = nome;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nomefantasia;
    }



}
