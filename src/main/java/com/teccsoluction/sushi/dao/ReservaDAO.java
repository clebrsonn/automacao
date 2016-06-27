package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Reserva;


@Service
public class ReservaDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Reserva> getAll() {
		    List<Reserva> result = em.createQuery("SELECT p FROM Reserva p", Reserva.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Reserva cliente) {			
		    em.persist(cliente);
		  }
			@Transactional
			  public void delete(long id) {
				Reserva cliente = em.getReference(Reserva.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Reserva PegarPorId(long id){
				
				Reserva cliente = em.find(Reserva.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Reserva reserva){
				Reserva reservaant =em.find(Reserva.class, id);
				
				reservaant.setNumero(reserva.getNumero());
				reservaant.setMesa(reserva.getMesa());
				reservaant.setData(reserva.getData());
				reservaant.setHora(reserva.getHora());
				

				
				reserva = em.merge(reservaant);
				
				
				
			}
	
	

}
