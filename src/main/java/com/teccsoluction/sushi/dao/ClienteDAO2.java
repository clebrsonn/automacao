package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
public class ClienteDAO2 extends AbstractEntityDao<Cliente>{


	public ClienteDAO2() {
        super(Cliente.class, "Cliente");
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


//	@PersistenceContext
//	  private EntityManager em;
//
//
//
//	  public List<Categoria> getAll() {
//		    List<Categoria> result = em.createQuery("SELECT p FROM Categoria p", Categoria.class).getResultList();
//		    return result;
//		  }
//
//			@Transactional
//		  public void add(Categoria categoria) {
//		    em.persist(categoria);
//		  }
//			@Transactional
//			  public void delete(long id) {
//			    Categoria categoria = em.getReference(Categoria.class, id);
//				em.remove(categoria);
//
//			  }
//
//			@Transactional
//			public Categoria PegarPorId(long id){
//
//				Categoria categoria = em.find(Categoria.class, id);
//
//
//				return categoria;
//			}
//
//			@Transactional
//			public void editar(long id,Categoria categoria){
//
//				Categoria categoriaant =em.find(Categoria.class, id);
//
//				categoriaant.setNome(categoria.getNome());
//				categoriaant.setCatpai(categoria.getCatpai());
////				categoria.setCatpai(categoriaant.getCatpai());
//
//				categoria = em.merge(categoriaant);
//
//
//
//			}
//
//

}
