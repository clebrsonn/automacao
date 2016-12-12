package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GARCON")
//@XmlRootElement(name = "garcon")
public class Garcon implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "senha")
    private String senha;    
    

//    @OneToMany(mappedBy = "garcon")
//    private List<PedidoVenda> pedidos;


    public Garcon() {
        // TODO Auto-generated constructor stub
//        pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//    public List<PedidoVenda> gePedidos() {
//        return pedidos;
//    }
//
//
//    public void setPedidos(List<PedidoVenda> pedidos) {
//        this.pedidos = pedidos;
//    }
	
    @Override
    public String toString() {
        return nome;
    }

}
