//package com.teccsoluction.sushi.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.teccsoluction.sushi.entidade.Despesa;
//
//
//
//@Service
//public class DespesaDAO {
//	
//	@PersistenceContext
//	  private EntityManager em;
//	
//	
//	
//	  public List<Despesa> getAll() {
//		    List<Despesa> result = em.createQuery("SELECT p FROM Despesa p", Despesa.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Despesa despesa) {			
//		    em.persist(despesa);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Despesa despesa = em.getReference(Despesa.class, id);
//				em.remove(despesa);
//				
//			  }
//			
//			@Transactional
//			public Despesa PegarPorId(long id){
//				
//				Despesa despesa = em.find(Despesa.class, id);
//				
//				
//				return despesa;
//			}
//			
//			@Transactional
//			public void editar(long id,Despesa despesa){
//				Despesa Despesaant =em.find(Despesa.class, id);
//				
//				Despesaant.setNome(despesa.getNome());
//				Despesaant.setValor(despesa.getValor());				
//				despesa = em.merge(Despesaant);
//				
//				
//				
//			}
//	
//	
//
//}
