//package com.teccsoluction.sushi.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.teccsoluction.sushi.entidade.Servico;
//
//
//@Service
//public class ServicoDAO {
//	
//	@PersistenceContext
//	  private EntityManager em;
//	
//	
//	
//	  public List<Servico> getAll() {
//		    List<Servico> result = em.createQuery("SELECT p FROM Servico p", Servico.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Servico servico) {			
//		    em.persist(servico);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Servico servico = em.getReference(Servico.class, id);
//				em.remove(servico);
//				
//			  }
//			
//			@Transactional
//			public Servico PegarPorId(long id){
//				
//				Servico servico = em.find(Servico.class, id);
//				
//				
//				return servico;
//			}
//			
//			@Transactional
//			public void editar(long id,Servico servico){
//				
//				Servico servicoant =em.find(Servico.class, id);
//				
//				servicoant.setNumero(servico.getNumero());
//				servicoant.setNome(servico.getNome());
//				servicoant.setPreco(servico.getPreco());
////				arquitetoant.setProjeto(projeto);
//				
//				servico = em.merge(servicoant);
//				
//				
//				
//			}
//	
//	
//
//}
