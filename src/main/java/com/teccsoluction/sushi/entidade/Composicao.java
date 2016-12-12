package com.teccsoluction.sushi.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPOSICAO")
public class Composicao extends Produto implements Serializable {

    private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID")
//	private long id;

    @Column(name = "numero")
    private String numero;

	@Column(name="nome")
	private String nome;
	// itens que formam uma composicao
	
	@JsonIgnore
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany
	private List<Item>listaItensComposicao;
	

    // itens que formam uma composicao

    @OneToMany
    private List<Item> listaItensComposicao;


    public Composicao() {
        // TODO Auto-generated constructor stub
        listaItensComposicao = new ArrayList<>();
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


//	public long getId() {
//		return id;
//	}


    public List<Item> getListaItensComposicao() {
        return listaItensComposicao;
    }


    public void setListaItensComposicao(List<Item> listaItensComposicao) {
        this.listaItensComposicao = listaItensComposicao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return nome;
    }


}
