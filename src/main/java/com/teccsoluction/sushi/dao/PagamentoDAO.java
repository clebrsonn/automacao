package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PagamentoDAO extends AbstractEntityDao<Pagamento> {


    public PagamentoDAO() {

        super(Pagamento.class, "Pagamento");
    }

    @Override
    protected void appendPredicate(StringBuilder predicate) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setParameters(TypedQuery<?> query) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void appendOrder(StringBuilder predicate) {
        // TODO Auto-generated method stub

    }

    //PEGA OS ITENS POR PEDIDO
    public List<Pagamento> getAllPagamento(long id) {
        List<Pagamento> result = manager.createQuery("SELECT p FROM Pagamento p where pedido_ID=" + id, Pagamento.class).getResultList();
        return result;
    }

}
