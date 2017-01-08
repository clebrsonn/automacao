package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DESCONTO")
public class Desconto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private String valor;


    public Desconto() {
        // TODO Auto-generated constructor stub
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getValor() {
        return valor;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
		this.id = id;
	}


	@Override
    public String toString() {
        return nome;
    }


}
