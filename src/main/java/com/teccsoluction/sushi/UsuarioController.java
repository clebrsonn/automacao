package com.teccsoluction.sushi;

import com.teccsoluction.sushi.dao.UsuarioDAO;
import com.teccsoluction.sushi.entidade.Usuario;
import com.teccsoluction.sushi.util.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	private List<Usuario>usuarioList;
	
	
	
	
	@RequestMapping(value = "cadastrousuario", method = RequestMethod.GET)
	public ModelAndView cadastroUsuario() {
		
		ModelAndView cadastrousuario = new ModelAndView("cadastrousuario");
		
		TipoUsuario[] tipoList = TipoUsuario.values() ;
	
		
		cadastrousuario.addObject("tipoList", tipoList);

		
		return cadastrousuario;
	}
	
	@RequestMapping(value = "/AddUsuario", method = RequestMethod.POST)
	public ModelAndView AdicionarUsuario(@ModelAttribute("Usuario") Usuario usuario) {
		
		ModelAndView cadastrousuario = new ModelAndView("cadastrousuario");
		
		usuarioDao.add(usuario);
		
		return cadastrousuario;
	}

	@RequestMapping(value = "/movimentacaousuario", method = RequestMethod.GET)
	public ModelAndView movimentacaoUsuario() {
		
		ModelAndView movimentacaousuario = new ModelAndView("movimentacaousuario");
		
		usuarioList = usuarioDao.getAll();
		
		movimentacaousuario.addObject("usuarioList", usuarioList);
		
		return movimentacaousuario;
	}
	
	
	
	@RequestMapping(value = "/edicaousuario", method = RequestMethod.GET)
	public ModelAndView edicaoUsuarioForm(HttpServletRequest request) {
		
		
		long id = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaousuario = new ModelAndView("edicaousuario");
		Usuario usuario=usuarioDao.PegarPorId(id);
		
		//carregando valores do enu tipousuario em um array
		TipoUsuario[] tipoList = TipoUsuario.values() ;
		
		edicaousuario.addObject("tipoList", tipoList);
		
		edicaousuario.addObject("usuario", usuario);
			
		
		return edicaousuario;
	}
	
	@RequestMapping(value = "/movimentacaousuario/edicaousuario", method = RequestMethod.POST)
	public ModelAndView edicaoUsuario(HttpServletRequest request, Usuario user) {
		
		long id = Long.parseLong(request.getParameter("id"));
		
//		 usuarioDao.editar(id, user);
				
			return new ModelAndView("redirect:/movimentacaousuario");
	}
	
	@RequestMapping(value = "/movimentacaousuario/delete", method = RequestMethod.GET)
	public ModelAndView deleteUsuario(HttpServletRequest request) {
		
		
		long id = Long.parseLong(request.getParameter("id"));
		usuarioDao.delete(id);
				
		return new ModelAndView("redirect:/movimentacaousuario");
	}
	
	
	
}
