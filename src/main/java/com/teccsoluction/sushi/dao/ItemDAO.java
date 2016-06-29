package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Item;

@Service
public class ItemDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	 public List<Item> getAll() {
		    List<Item> result = em.createQuery("SELECT p FROM Item p", Item.class).getResultList();
		    return result;
		  }
	 
	 
	 public List<Item> getAllId(long id) {
		    List<Item> result = em.createQuery("SELECT p FROM Item p where pedido="+id+"", Item.class).getResultList();
		    return result;
		  }
	 
		@Transactional
		  public void add(Item item) {			
		    em.persist(item);
		  }
			@Transactional
			  public void delete(long id) {
				Item item = em.getReference(Item.class, id);
				em.remove(item);
				
			  }
			
			
			@Transactional
			public Item PegarPorId(long id){
				
				Item item = em.find(Item.class, id);
				
				
				return item;
			}
			
			@Transactional
			public void editar(long id,Item item){
				Item itemant =em.find(Item.class, id);
				
				itemant.setCodigo(item.getCodigo());
				itemant.setDescricao(item.getDescricao());
				itemant.setPrecoUnitario(item.getPrecoUnitario());
				itemant.setQtd(item.getQtd());
				itemant.setTotalItem(item.getTotalItem());
				itemant.setPedido(item.getPedido());
//				arquitetoant.setProjeto(projeto);
				
				item = em.merge(itemant);
				
				
				
			}

}
