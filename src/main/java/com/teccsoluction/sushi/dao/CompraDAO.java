package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Compra;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.Recebimento;
import com.teccsoluction.sushi.entidade.Venda;


@Service
public class CompraDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	 public List<Compra> getAll() {
		    List<Compra> result = em.createQuery("SELECT p FROM Compra p", Compra.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Compra compra) {			
		    em.persist(compra);
		  }
			@Transactional
			  public void delete(long id) {
				Compra compra = em.getReference(Compra.class, id);
				em.remove(compra);
				
			  }
			
			@Transactional
			public Compra PegarPorId(long id){
				
				Compra compra = em.find(Compra.class, id);
				
				
				return compra;
			}
			
			@Transactional
			public void editar(long id,Compra compra){
				
				Compra compraant =em.find(Compra.class, id);
				
				compraant.setData(compra.getData());
				compraant.setStatus(compra.getStatus());
				compraant.setPagamento(compra.getPagamento());
				compraant.setFornecedor(compra.getFornecedor());
				compra = em.merge(compraant);
			
			}

}
