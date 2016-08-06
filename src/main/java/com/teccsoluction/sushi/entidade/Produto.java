package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.UnidadeMedida;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CODEBAR")
    private String codebar;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "UM")
    @Enumerated(EnumType.ORDINAL)
    private UnidadeMedida um;

    @Column(name = "PRECO_CUSTO")
    private double precoCusto;

    @Column(name = "PRECO_VENDA")
    private double precoVenda;

    @ManyToOne
    @JoinColumn
    private Fornecedor fornecedor;


    @OneToMany(mappedBy = "produto")
    private List<Item> items;

    @ManyToOne
    @JoinColumn
    private Categoria categoria;


    public Produto() {
        // TODO Auto-generated constructor stub
        items = new ArrayList<Item>();
    }


    public Fornecedor getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public String getNumero() {
        return codebar;
    }


    public void setCodebar(String codebar) {
        this.codebar = codebar;
    }


    public long getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public UnidadeMedida getUm() {
        return um;
    }


    public void setUm(UnidadeMedida um) {
        this.um = um;
    }


    public double getPrecoCusto() {
        return precoCusto;
    }


    public void setPrecoCusto(double preco) {
        this.precoCusto = preco;
    }


    public double getPrecoVenda() {
        return precoVenda;
    }


    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }


    public String getCodebar() {
        return codebar;
    }


    public List<Item> getItems() {
        return items;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return descricao;
    }


}
