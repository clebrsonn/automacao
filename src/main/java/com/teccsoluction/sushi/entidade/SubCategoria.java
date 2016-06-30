package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by winds on 29/06/2016.
 */


@Entity
@Table(name = "SUBCATEGORIA")
public class SubCategoria implements Serializable {

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
    private Categoria categorias;

    public SubCategoria() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return  nome ;
    }


}
