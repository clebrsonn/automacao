//package com.teccsoluction.sushi.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.teccsoluction.sushi.entidade.Pagamento;
//
//
//@Service
//public class PagamentoDAO {
//	
//	@PersistenceContext
//	  private EntityManager em;
//	
//	
//	
//	  public List<Pagamento> getAll() {
//		    List<Pagamento> result = em.createQuery("SELECT p FROM Pagamento p", Pagamento.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Pagamento cliente) {			
//		    em.persist(cliente);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Pagamento cliente = em.getReference(Pagamento.class, id);
//				em.remove(cliente);
//				
//			  }
//			
//			@Transactional
//			public Pagamento PegarPorId(long id){
//				
//				Pagamento cliente = em.find(Pagamento.class, id);
//				
//				
//				return cliente;
//			}
//			
//			@Transactional
//			public void editar(long id,Pagamento pagamento){
//				Pagamento pagamentoant =em.find(Pagamento.class, id);
//				
//				pagamentoant.setNumero(pagamento.getNumero());
//				pagamentoant.setNome(pagamento.getNome());
//				pagamentoant.setParcelas(pagamento.getParcelas());
//				pagamentoant.setTipo(pagamento.getTipo());
//
//
//				
////				arquitetoant.setProjeto(projeto);
//				
//				pagamento = em.merge(pagamentoant);
//				
//				
//				
//			}
//	
//	
//
//}
