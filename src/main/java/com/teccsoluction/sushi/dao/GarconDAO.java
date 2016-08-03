//package com.teccsoluction.sushi.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.teccsoluction.sushi.entidade.Garcon;
//
//
//@Service
//public class GarconDAO {
//
//	@PersistenceContext
//	  private EntityManager em;
//
//
//
//	  public List<Garcon> getAll() {
//		    List<Garcon> result = em.createQuery("SELECT p FROM Garcon p", Garcon.class).getResultList();
//		    return result;
//		  }
//
//			@Transactional
//		  public void add(Garcon cliente) {
//		    em.persist(cliente);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Garcon cliente = em.getReference(Garcon.class, id);
//				em.remove(cliente);
//
//			  }
//
//			@Transactional
//			public Garcon PegarPorId(long id){
//
//				Garcon cliente = em.find(Garcon.class, id);
//
//
//				return cliente;
//			}
//
//			@Transactional
//			public void editar(long id,Garcon cliente){
//				Garcon clienteant =em.find(Garcon.class, id);
//
//				clienteant.setNome(cliente.getNome());
////				arquitetoant.setProjeto(projeto);
//
//				cliente = em.merge(clienteant);
//
//
//
//			}
//
//
//
//}
