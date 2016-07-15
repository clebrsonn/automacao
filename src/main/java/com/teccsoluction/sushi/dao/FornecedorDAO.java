package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
public class FornecedorDAO extends AbstractEntityDao<Fornecedor> {


    public FornecedorDAO() {
        super(Fornecedor.class, "Fornecedor");
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


//
//	@PersistenceContext
//	  private EntityManager em;
//
//
//
//	  public List<Fornecedor> getAll() {
//		    List<Fornecedor> result = em.createQuery("SELECT p FROM Fornecedor p", Fornecedor.class).getResultList();
//		    return result;
//		  }
//
//			@Transactional
//		  public void add(Fornecedor cliente) {
//		    em.persist(cliente);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Fornecedor cliente = em.getReference(Fornecedor.class, id);
//				em.remove(cliente);
//
//			  }
//
//			@Transactional
//			public Fornecedor PegarPorId(long id){
//
//				Fornecedor cliente = em.find(Fornecedor.class, id);
//
//
//				return cliente;
//			}
//
//			@Transactional
//			public void editar(long id,Fornecedor fornecedor){
//				Fornecedor fornecedorant =em.find(Fornecedor.class, id);
//
//				fornecedorant.setNomefantasia(fornecedor.getNomefantasia());
//				fornecedorant.setCnpj(fornecedor.getCnpj());
//				fornecedorant.setInscricaoestadual(fornecedor.getInscricaoestadual());
//				fornecedorant.setRazaoSocial(fornecedor.getRazaoSocial());
////				arquitetoant.setProjeto(projeto);
//
//				fornecedor = em.merge(fornecedorant);
//
//
//
//			}
//
//

}
