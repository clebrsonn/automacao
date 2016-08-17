package com.teccsoluction.sushi.entidade;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "CAIXA")
public class Caixa implements Serializable {

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

//    @ManyToOne
//    private Caixa catpai;
//
//    @OneToMany(mappedBy = "categoria")
//    private List<Produto> produtos;


    //CONSTRUTOR PADRAO

    public Caixa() {
        // TODO Auto-generated constructor stub
    }
    
    public Caixa(Caixa cat) {
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

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }



}
