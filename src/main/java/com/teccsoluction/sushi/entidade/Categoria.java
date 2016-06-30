package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


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

    @JoinColumn(name="CAT_PAI_ID",nullable=true)
    private Categoria catpai;


    //CONSTRUTOR PADRAO

    public Categoria() {
        // TODO Auto-generated constructor stub
    }
    
    public Categoria(Categoria cat) {
        // TODO Auto-generated constructor stub
    	this.catpai=cat;
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

//    public SubCategoria getSubCategoria() {
//        return subCategoria;
//    }
//
//    public void setSubCategoria(SubCategoria subCategoria) {
//        this.subCategoria=subCategoria;
//    }
    
    
    

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


}
