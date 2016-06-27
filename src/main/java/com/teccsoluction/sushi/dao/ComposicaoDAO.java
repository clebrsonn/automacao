package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Composicao;


@Service
public class ComposicaoDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Composicao> getAll() {
		    List<Composicao> result = em.createQuery("SELECT p FROM Composicao p", Composicao.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Composicao composicao) {			
		    em.persist(composicao);
		  }
			@Transactional
			  public void delete(long id) {
				Composicao composicao = em.getReference(Composicao.class, id);
				em.remove(composicao);
				
			  }
			
			@Transactional
			public Composicao PegarPorId(long id){
				
				Composicao composicao = em.find(Composicao.class, id);
				
				
				return composicao;
			}
			
			@Transactional
			public void editar(long id,Composicao composicao){
				Composicao composicaoant =em.find(Composicao.class, id);
				
				composicaoant.setNumero(composicao.getNumero());
				composicaoant.setNome(composicao.getNome());
//				arquitetoant.setProjeto(projeto);
				
				composicao = em.merge(composicaoant);
				
				
				
			}
	
	

}
