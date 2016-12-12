package com.teccsoluction.sushi.controller.api;


import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import java.util.List;


@RestController
@RequestMapping(value = "cliente")
public class ClienteControllerRest {

    private
    final
    ClienteDAO dao;

    @Autowired
    public ClienteControllerRest(ClienteDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<Cliente> getDao() {
        return dao;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> buscarEntity(@PathVariable long id) {
    	Cliente cliente = getDao().PegarPorId(id);
        if (cliente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(Cliente entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listarEntity() {
        return getDao().getAll();

    }

}
