package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;


@Service
public class ProdutoDAO extends AbstractEntityDao<Produto> {


    public ProdutoDAO() {
        super(Produto.class, "Produto");
    }

    @Override
    protected void appendPredicate(StringBuilder predicate) {

    }

    @Override
    protected void setParameters(TypedQuery<?> query) {

    }

    @Override
    protected void appendOrder(StringBuilder predicate) {

    }

    //pega os produtos de uma determinada categoria
    public List<Produto> getAllProdutosCategoria(long id) {
        List<Produto> result = manager.createQuery("SELECT p FROM Produto p where categoria_ID=" + id, Produto.class).getResultList();
        return result;
    }


//	@PersistenceContext
//	  private EntityManager em;
//
//
//
//	  public List<Produto> getAll() {
//		    List<Produto> result = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
//		    return result;
//		  }
//
//			@Transactional
//		  public void add(Produto produto) {
//		    em.persist(produto);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Produto cliente = em.getReference(Produto.class, id);
//				em.remove(cliente);
//
//			  }
//
//			@Transactional
//			public Produto PegarPorId(long id){
//
//				Produto cliente = em.find(Produto.class, id);
//
//
//				return cliente;
//			}
//
//			@Transactional
//			public void editar(long id,Produto produto){
//				Produto produtoant =em.find(Produto.class, id);
//
//				produtoant.setCodebar(produto.getCodebar());
//				produtoant.setCategoria(produto.getCategoria());
//				produtoant.setDescricao(produto.getDescricao());
//				produtoant.setPrecoCusto(produto.getPrecoCusto());
//				produtoant.setPrecoVenda(produtoant.getPrecoVenda());
//				produtoant.setUm(produto.getUm());
//				produtoant.setFornecedor(produto.getFornecedor());
//
//				produto = em.merge(produtoant);
//
//
//
//			}
//


}
