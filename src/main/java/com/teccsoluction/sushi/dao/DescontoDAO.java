package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Desconto;




@Service
public class DescontoDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Desconto> getAll() {
		    List<Desconto> result = em.createQuery("SELECT p FROM Desconto p", Desconto.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Desconto desconto) {			
		    em.persist(desconto);
		  }
			@Transactional
			  public void delete(long id) {
				Desconto desconto = em.getReference(Desconto.class, id);
				em.remove(desconto);
				
			  }
			
			@Transactional
			public Desconto PegarPorId(long id){
				
				Desconto despesa = em.find(Desconto.class, id);
				
				
				return despesa;
			}
			
			@Transactional
			public void editar(long id,Desconto desconto){
				Desconto descontoaant =em.find(Desconto.class, id);
				
				descontoaant.setNumero(desconto.getNumero());
				descontoaant.setNome(desconto.getNome());
				descontoaant.setValor(desconto.getValor());
//				arquitetoant.setProjeto(projeto);
				
				desconto = em.merge(descontoaant);
				
				
				
			}
	
	

}
