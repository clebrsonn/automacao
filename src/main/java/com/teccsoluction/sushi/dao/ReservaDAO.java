//package com.teccsoluction.sushi.dao;
//
//import com.teccsoluction.sushi.entidade.Reserva;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@Repository
//public class ReservaDAO {
//	
//	@PersistenceContext
//	  private EntityManager em;
//	
//	
//	
//	  public List<Reserva> getAll() {
//		    List<Reserva> result = em.createQuery("SELECT p FROM Reserva p", Reserva.class).getResultList();
//		    return result;
//		  }
//		   
//			@Transactional
//		  public void add(Reserva cliente) {			
//		    em.persist(cliente);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Reserva cliente = em.getReference(Reserva.class, id);
//				em.remove(cliente);
//				
//			  }
//			
//			@Transactional
//			public Reserva PegarPorId(long id){
//				
//				Reserva cliente = em.find(Reserva.class, id);
//				
//				
//				return cliente;
//			}
//			
//			@Transactional
//			public void editar(long id,Reserva reserva){
//				Reserva reservaant =em.find(Reserva.class, id);
//				
//				reservaant.setNumero(reserva.getNumero());
//				reservaant.setMesa(reserva.getMesa());
//				reservaant.setData(reserva.getData());
//				reservaant.setHora(reserva.getHora());
//				
//
//				
//				reserva = em.merge(reservaant);
//				
//				
//				
//			}
//	
//	
//
//}
