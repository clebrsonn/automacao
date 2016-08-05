package com.teccsoluction.sushi.dao.generic;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.teccsoluction.sushi.entidade.Compra;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
@Repository
public class CompraDAO extends AbstractEntityDao<Compra> {
	
	
	
	
	public CompraDAO(){
		
		super(Compra.class,"Compra");
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
