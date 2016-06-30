package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Usuario;


@Service
public class UsuarioDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Usuario> getAll() {
		    List<Usuario> result = em.createQuery("SELECT p FROM Usuario p", Usuario.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Usuario cliente) {			
		    em.persist(cliente);
		  }
			@Transactional
			  public void delete(long id) {
				Usuario cliente = em.getReference(Usuario.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Usuario PegarPorId(long id){
				
				Usuario cliente = em.find(Usuario.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Usuario cliente){
				Usuario clienteant =em.find(Usuario.class, id);
				
				clienteant.setNome(cliente.getNome());
//				arquitetoant.setProjeto(projeto);
				
				cliente = em.merge(clienteant);
				
				
				
			}
	
	

}
