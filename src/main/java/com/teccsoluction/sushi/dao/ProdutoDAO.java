package com.teccsoluction.sushi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teccsoluction.sushi.entidade.Produto;


@Service
public class ProdutoDAO {
	
	@PersistenceContext
	  private EntityManager em;
	
	
	
	  public List<Produto> getAll() {
		    List<Produto> result = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
		    return result;
		  }
		   
			@Transactional
		  public void add(Produto produto) {			
		    em.persist(produto);
		  }
			@Transactional
			  public void delete(long id) {
				Produto cliente = em.getReference(Produto.class, id);
				em.remove(cliente);
				
			  }
			
			@Transactional
			public Produto PegarPorId(long id){
				
				Produto cliente = em.find(Produto.class, id);
				
				
				return cliente;
			}
			
			@Transactional
			public void editar(long id,Produto produto){
				Produto produtoant =em.find(Produto.class, id);
				
				produtoant.setCodebar(produto.getCodebar());
				produtoant.setDescricao(produto.getDescricao());
				produtoant.setPrecoCusto(produto.getPrecoCusto());
				produtoant.setPrecoVenda(produtoant.getPrecoVenda());
				produtoant.setUm(produto.getUm());
//				arquitetoant.setProjeto(projeto);
				
				produto = em.merge(produtoant);
				
				
				
			}
	
	

}
