package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "CATEGORIA")
public class Categoria implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "CAT_PAI", nullable = true)
    private Categoria catPai;


    //CONSTRUTOR PADRAO

    public Categoria() {
        // TODO Auto-generated constructor stub
    }


    //GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public long getId() {
        return id;
    }

    public Categoria getCatPai() {
        return catPai;
    }

    public void setCatPai(Categoria catPai) {
        this.catPai = catPai;
    }


    @Override
    public String toString() {
        return nome;
    }


}
