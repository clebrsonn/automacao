package com.teccsoluction.sushi.entidade;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COTACAO")
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToMany(mappedBy = "cotacoes")
    private List<Item> itens;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

//    @ManyToOne
//    @JoinColumn
//    private PedidoCompra pedidoCompra;

    public Cotacao() {
        itens = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

//    public PedidoCompra getPedidoCompra() {
//        return pedidoCompra;
//    }
//
//    public void setPedidoCompra(PedidoCompra pedidoCompra) {
//        this.pedidoCompra = pedidoCompra;
//    }
}
