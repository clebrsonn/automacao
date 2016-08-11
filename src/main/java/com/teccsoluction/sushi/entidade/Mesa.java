package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "MESA")
public class Mesa implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    private String numero;

    private String status;

//    @OneToMany(mappedBy = "mesa")
//    private List<PedidoVenda> pedidos;

    public Mesa() {
        // TODO Auto-generated constructor stub
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

//    public List<PedidoVenda> getPedidos() {
//        return pedidos;
//    }
//
//    public void setPedidos(List<PedidoVenda> pedidos) {
//        this.pedidos = pedidos;
//    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return numero;
    }


}
