package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Cliente;


@Service
public class ClienteDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Cliente> getAll() {
		    List<Cliente> result = em.createQuery("SELECT p FROM Cliente p", Cliente.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Cliente cliente) {			
		    em.persist(cliente);
		  }
			@Transactional
			  public void delete(long id) {
				Cliente cliente = em.getReference(Cliente.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Cliente PegarPorId(long id){
				
				Cliente cliente = em.find(Cliente.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Cliente cliente){
				Cliente clienteant =em.find(Cliente.class, id);
				
				clienteant.setNome(cliente.getNome());
				clienteant.setEmail(cliente.getEmail());
				clienteant.setDataNascimento(cliente.getDataNascimento());
				clienteant.setTelefone(cliente.getTelefone());
//				arquitetoant.setProjeto(projeto);
				
				cliente = em.merge(clienteant);
				
				
				
			}
	
	

}
