package com.teccsoluction.sushi.dao.generic;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Repository
public class PedidoCompraDAO  extends AbstractEntityDao<PedidoCompra>{

	
 public PedidoCompraDAO() {
	// TODO Auto-generated constructor stub
	 
     super(PedidoCompra.class, "PedidoCompra");

}

@Override
protected void appendPredicate(StringBuilder predicate) {
	// TODO Auto-generated method stub
	
}

@Override
protected void setParameters(TypedQuery<?> query) {
	// TODO Auto-generated method stub
	
}

@Override
protected void appendOrder(StringBuilder predicate) {
	// TODO Auto-generated method stub
	
}	
	
	

}
