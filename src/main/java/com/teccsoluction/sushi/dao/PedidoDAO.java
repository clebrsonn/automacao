package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Pedido;


@Service
public class PedidoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	 public List<Pedido> getAll() {
		    List<Pedido> result = em.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Pedido pedido) {			
		    em.persist(pedido);
		  }
			@Transactional
			  public void delete(long id) {
				Pedido pedido = em.getReference(Pedido.class, id);
				em.remove(pedido);
				
			  }
			
			@Transactional
			public Pedido PegarPorId(long id){
				
				Pedido pedido = em.find(Pedido.class, id);
				
				
				return pedido;
			}
			
			@Transactional
			public void editar(long id,Pedido pedido){
				
				Pedido pedidoant =em.find(Pedido.class, id);
				
				pedidoant.setGarcon(pedido.getGarcon());
//				pedidoant.setListaItens(pedido.getListaItens());
				pedidoant.setMesa(pedido.getMesa());
				pedidoant.setStatus(pedido.getStatus());
				pedidoant.setTotal(pedido.getTotal());
				pedidoant.setData(pedido.getData());
				pedidoant.setTipo(pedido.getTipo());
//				arquitetoant.setProjeto(projeto);
				
				pedido = em.merge(pedidoant);
				
				
				
			}

}
