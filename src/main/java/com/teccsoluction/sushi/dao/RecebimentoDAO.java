package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.Recebimento;
import com.teccsoluction.sushi.entidade.Venda;


@Service
public class RecebimentoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	 public List<Recebimento> getAll() {
		    List<Recebimento> result = em.createQuery("SELECT p FROM Recebimento p", Recebimento.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Recebimento recebimento) {			
		    em.persist(recebimento);
		  }
			@Transactional
			  public void delete(long id) {
				Recebimento recebimento = em.getReference(Recebimento.class, id);
				em.remove(recebimento);
				
			  }
			
			@Transactional
			public Recebimento PegarPorId(long id){
				
				Recebimento recebimento = em.find(Recebimento.class, id);
				
				
				return recebimento;
			}
			
			@Transactional
			public void editar(long id,Recebimento recebimento){
				
				Recebimento recebimentoant =em.find(Recebimento.class, id);
				
				recebimentoant.setData(recebimento.getData());
				recebimentoant.setStatus(recebimento.getStatus());
				recebimentoant.setCompra(recebimento.getCompra());
				recebimentoant.setPagamento(recebimento.getPagamento());
				recebimentoant.setFornecedor(recebimento.getFornecedor());

				
				recebimento = em.merge(recebimentoant);
				
				
				
			}

}
