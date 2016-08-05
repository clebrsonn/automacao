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
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Venda;
//
//
//@Service
//public class VendaDAO {
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	
//	 public List<Venda> getAll() {
//		    List<Venda> result = em.createQuery("SELECT p FROM Venda p", Venda.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Venda venda) {			
//		    em.persist(venda);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Venda venda = em.getReference(Venda.class, id);
//				em.remove(venda);
//				
//			  }
//			
//			@Transactional
//			public Venda PegarPorId(long id){
//				
//				Venda venda = em.find(Venda.class, id);
//				
//				
//				return venda;
//			}
//			
//			@Transactional
//			public void editar(long id,Venda venda){
//				
//				Venda vendaant =em.find(Venda.class, id);
//				
//				vendaant.setData(venda.getData());
//				vendaant.setStatus(venda.getStatus());
//				vendaant.setPagamento(venda.getPagamento());;
//				vendaant.setPedido(venda.getPedido());
//
//				
//				venda = em.merge(vendaant);
//				
//				
//				
//			}
//
//}
