package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Categoria;


@Service
public class CategoriaDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Categoria> getAll() {
		    List<Categoria> result = em.createQuery("SELECT p FROM Categoria p", Categoria.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Categoria categoria) {			
		    em.persist(categoria);
		  }
			@Transactional
			  public void delete(long id) {
			    Categoria categoria = em.getReference(Categoria.class, id);
				em.remove(categoria);
				
			  }
			
			@Transactional
			public Categoria PegarPorId(long id){
				
				Categoria categoria = em.find(Categoria.class, id);
				
				
				return categoria;
			}
			
			@Transactional
			public void editar(long id,Categoria categoria){
				
				Categoria categoriaant =em.find(Categoria.class, id);
				
				categoriaant.setNome(categoria.getNome());
//				arquitetoant.setProjeto(projeto);
				
				categoria = em.merge(categoriaant);
				
				
				
			}
	
	

}
