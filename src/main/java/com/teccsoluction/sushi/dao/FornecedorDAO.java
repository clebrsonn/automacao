package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teccsoluction.sushi.entidade.Fornecedor;



@Service
public class FornecedorDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Fornecedor> getAll() {
		    List<Fornecedor> result = em.createQuery("SELECT p FROM Fornecedor p", Fornecedor.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Fornecedor cliente) {			
		    em.persist(cliente);
		  }
			@Transactional
			  public void delete(long id) {
				Fornecedor cliente = em.getReference(Fornecedor.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Fornecedor PegarPorId(long id){
				
				Fornecedor cliente = em.find(Fornecedor.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Fornecedor fornecedor){
				Fornecedor fornecedorant =em.find(Fornecedor.class, id);
				
				fornecedorant.setNomefantasia(fornecedor.getNomefantasia());
				fornecedorant.setCnpj(fornecedor.getCnpj());
				fornecedorant.setInscricaoestadual(fornecedor.getInscricaoestadual());
				fornecedorant.setRazaoSocial(fornecedor.getRazaoSocial());
//				arquitetoant.setProjeto(projeto);
				
				fornecedor = em.merge(fornecedorant);
				
				
				
			}
	
	

}
