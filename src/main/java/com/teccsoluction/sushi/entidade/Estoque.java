package com.teccsoluction.sushi.entidade;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by clebr on 06/08/2016.
 */
@Entity
@Table(name = "ESTOQUE")
public class Estoque  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "nome")
    private String nome;

    @OneToMany
    private List<Item> items;
    
    
    public Estoque() {
		// TODO Auto-generated constructor stub
    	
    	items = new ArrayList<>();
	}
    

    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
