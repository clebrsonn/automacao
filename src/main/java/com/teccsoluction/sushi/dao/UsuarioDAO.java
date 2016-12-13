package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Usuario;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
public class UsuarioDAO extends AbstractEntityDao<Usuario> {


    public UsuarioDAO() {
        super(Usuario.class, "Usuario");
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
//	  public List<Usuario> getAll() {
//		    List<Usuario> result = em.createQuery("SELECT p FROM Usuario p", Usuario.class).getResultList();
//		    return result;
//		  }
//
//			@Transactional
//		  public void add(Usuario usuario) {
//		    em.persist(usuario);
//		  }
//			@Transactional
//			  public void delete(long id) {
//				Usuario usuario = em.getReference(Usuario.class, id);
//				em.remove(usuario);
//
//			  }
//
//			@Transactional
//			public Usuario PegarPorId(long id){
//
//				Usuario usuario = em.find(Usuario.class, id);
//
//
//				return usuario;
//			}
//
//			@Transactional
//			public void editar(long id,Usuario usuario){
//				Usuario usuarioant =em.find(Usuario.class, id);
//
//				usuarioant.setNome(usuario.getNome());
//				usuarioant.setSenha(usuario.getSenha());
//				usuarioant.setTipo(usuario.getTipo());
//				usuarioant.setEmail(usuario.getEmail());
////				arquitetoant.setProjeto(projeto);
//
//				usuario = em.merge(usuarioant);
//
//
//
//			}
//
//

}
