package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.TipoPedido;

import javax.persistence.*;

@Entity
@Table(name = "PEDIDO_VENDA")
public class PedidoVenda extends Pedido {

    @Enumerated(EnumType.ORDINAL)
    private TipoPedido tipo;

    @ManyToOne
    @JoinColumn
    private Mesa mesa;

    private double total;

    @ManyToOne
    @JoinColumn
    private Garcon garcon;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    public PedidoVenda() {
    }

    public TipoPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoPedido tipo) {
        this.tipo = tipo;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}
