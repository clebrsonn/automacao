package com.teccsoluction.sushi.entidade;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "CATEGORIA")
public class Categoria implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME", nullable = false)
    private String nome;
<<<<<<< HEAD

    @ManyToOne
    @JoinColumn(name = "CAT_PAI", nullable = true)
=======
    
    @JsonIgnore
>>>>>>> fae67ff... Reconfiguracao e Atualização Projeto
    private Categoria catpai;
    
    @JsonIgnore
	@LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;


    //CONSTRUTOR PADRAO

    public Categoria() {
        // TODO Auto-generated constructor stub
    }

//    public Categoria(Categoria cat) {
//        // TODO Auto-generated constructor stub
//    	this.catpai=cat;
//    }


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


    @Override
    public String toString() {
        return nome;
    }


    public Categoria getCatpai() {
        return catpai;
    }


    public void setCatpai(Categoria catpai) {
        this.catpai = catpai;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
