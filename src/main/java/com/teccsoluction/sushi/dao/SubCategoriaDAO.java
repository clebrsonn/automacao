package com.teccsoluction.sushi.dao;


import com.teccsoluction.sushi.entidade.SubCategoria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Service
public class SubCategoriaDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<SubCategoria> getAll() {
		    List<SubCategoria> result = em.createQuery("SELECT p FROM SubCategoria p", SubCategoria.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(SubCategoria subcategoria) {
		    em.persist(subcategoria);
		  }
			@Transactional
			  public void delete(long id) {
				SubCategoria subcategoria = em.getReference(SubCategoria.class, id);
				em.remove(subcategoria);
				
			  }
			
			@Transactional
			public SubCategoria PegarPorId(long id){

				SubCategoria subcategoria = em.find(SubCategoria.class, id);
				
				
				return subcategoria;
			}
			
			@Transactional
			public void editar(long id,SubCategoria subcategoria){

				SubCategoria subcategoriaant =em.find(SubCategoria.class, id);
				
				subcategoriaant.setNome(subcategoria.getNome());
				subcategoriaant.setCategorias(subcategoria.getCategorias());


				subcategoria = em.merge(subcategoriaant);
				
				
				
			}
	
	

}
