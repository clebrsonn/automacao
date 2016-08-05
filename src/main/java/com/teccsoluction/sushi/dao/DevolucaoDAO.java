//package com.teccsoluction.sushi.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.teccsoluction.sushi.entidade.Devolucao;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Recebimento;
//import com.teccsoluction.sushi.entidade.Venda;
//
//
//@Service
//public class DevolucaoDAO {
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	
//	 public List<Devolucao> getAll() {
//		    List<Devolucao> result = em.createQuery("SELECT p FROM Devolucao p", Devolucao.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Devolucao devolucao) {			
//		    em.persist(devolucao);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Devolucao devolucao = em.getReference(Devolucao.class, id);
//				em.remove(devolucao);
//				
//			  }
//			
//			@Transactional
//			public Devolucao PegarPorId(long id){
//				
//				Devolucao devolucao = em.find(Devolucao.class, id);
//				
//				
//				return devolucao;
//			}
//			
//			@Transactional
//			public void editar(long id,Devolucao devolucao){
//				
//				Devolucao devolucaoant =em.find(Devolucao.class, id);
//				
//				devolucaoant.setData(devolucao.getData());
//				devolucaoant.setStatus(devolucao.getStatus());
//				devolucaoant.setTipo(devolucao.getTipo());
//				devolucaoant.setFornecedor(devolucao.getFornecedor());
//
//				
//				devolucao = em.merge(devolucaoant);
//				
//				
//				
//			}
//
//}
