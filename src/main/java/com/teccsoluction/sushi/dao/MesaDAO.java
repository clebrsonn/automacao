package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Mesa;


@Service
public class MesaDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Mesa> getAll() {
		    List<Mesa> result = em.createQuery("SELECT p FROM Mesa p", Mesa.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Mesa mesa) {			
		    em.persist(mesa);
		  }
			@Transactional
			  public void delete(long id) {
				Mesa mesa = em.getReference(Mesa.class, id);
				em.remove(mesa);
				
			  }
			
			@Transactional
			public Mesa PegarPorId(long id){
				
				Mesa mesa = em.find(Mesa.class, id);
				
				
				return mesa;
			}
			
			@Transactional
			public void editar(long id,Mesa mesa){
				Mesa mesaant =em.find(Mesa.class, id);
				
				mesaant.setNumero(mesa.getNumero());
//				arquitetoant.setProjeto(projeto);
				
				mesa = em.merge(mesaant);
				
				
				
			}
	
	

}
