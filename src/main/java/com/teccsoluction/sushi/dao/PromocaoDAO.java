package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Promocao;


@Service
public class PromocaoDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Promocao> getAll() {
		    List<Promocao> result = em.createQuery("SELECT p FROM Promocao p", Promocao.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Promocao cliente) {			
		    em.persist(cliente);
		  }
			@Transactional
			  public void delete(long id) {
				Promocao cliente = em.getReference(Promocao.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Promocao PegarPorId(long id){
				
				Promocao cliente = em.find(Promocao.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Promocao promocao){
				Promocao promocaoant =em.find(Promocao.class, id);
				
				promocaoant.setNumero(promocao.getNumero());
				promocaoant.setNome(promocao.getNome());
				promocaoant.setDatainicio(promocao.getDatainicio());
				promocaoant.setDatafim(promocao.getDatafim());
				
//				arquitetoant.setProjeto(projeto);
				
				promocao = em.merge(promocaoant);
				
				
				
			}
	
	

}
