package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.ClienteDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Despesa;


@Controller
public class ClienteController {
	
	@Autowired
	private ClienteDAO clienteDao;
	
	private List<Cliente> clienteList;
	
	
	
	
	@RequestMapping(value = "cadastrocliente", method = RequestMethod.GET)
	public ModelAndView cadastroCliente() {
		
		ModelAndView cadastrocliente = new ModelAndView("cadastrocliente");
		
		return cadastrocliente;
	}
	
	@RequestMapping(value = "/AddCliente", method = RequestMethod.POST)
	public ModelAndView AdicionarCliente(@ModelAttribute("Cliente") Cliente cliente) {
		
		ModelAndView cadastro_cliente = new ModelAndView("cadastrocliente");
		
		clienteDao.add(cliente);
		
		return cadastro_cliente;
	}

	
	
	@RequestMapping(value = "/movimentacaocliente", method = RequestMethod.GET)
	public ModelAndView movimentacaoCliente() {
		
		ModelAndView movimentacaocliente = new ModelAndView("movimentacaocliente");
		
		clienteList = clienteDao.getAll();
		
		movimentacaocliente.addObject("clienteList",clienteList);
		
		return movimentacaocliente;
	}
	
	
	@RequestMapping(value = "/edicaocliente", method = RequestMethod.GET)
	public ModelAndView editarClienteForm(HttpServletRequest request) {
		
		Cliente cliente;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaocliente = new ModelAndView("edicaocliente");
		cliente = clienteDao.PegarPorId(idf);
		edicaocliente.addObject("cliente", cliente);
		
		
		return edicaocliente;
	}
	
	
	@RequestMapping(value = "/movimentacaocliente/edicaocliente", method = RequestMethod.POST)
	public ModelAndView editarCliente(HttpServletRequest request, Cliente cliente) {
		
		
		
		Long idf = Long.parseLong(request.getParameter("id"));
		clienteDao.editar(idf, cliente);
		
		
		return new ModelAndView("redirect:/movimentacaocliente");
	}
	
	
	
	@RequestMapping(value = "/movimentacaocliente/delete", method = RequestMethod.GET)
	public ModelAndView deleteCliente(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
		clienteDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaocliente");
	}
	
}
