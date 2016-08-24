package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "RECEBIMENTO")
public class Recebimento implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DATA")
    private Date data;
    
    @Column(name="STATUS")
    private String status;

//	@OneToMany
//	private List<Compra> compra;


    //private Pagamento pagamento;

    //private Fornecedor fornecedor;


    public Recebimento() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "ID RECEBIMENTO:" + id;
    }

}
