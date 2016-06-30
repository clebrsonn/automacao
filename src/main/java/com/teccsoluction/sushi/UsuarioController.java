package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.UsuarioDAO;
import com.teccsoluction.sushi.entidade.Usuario;

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
		
		return cadastrousuario;
	}
	
	@RequestMapping(value = "/AddUsuario", method = RequestMethod.POST)
	public ModelAndView AdicionarUsuario(@ModelAttribute("Usuario") Usuario mesa) {
		
		ModelAndView cadastrousuario = new ModelAndView("cadastrousuario");
		
		usuarioDao.add(mesa);
		
		return cadastrousuario;
	}
//	
//	@RequestMapping(value = "cadastrocategoria", method = RequestMethod.GET)
//	public ModelAndView cadastrocategoria() {
//		
//		ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
//		
//		return cadastrocategoria;
//	}
//	
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
		edicaousuario.addObject("usuario", usuario);
			
		
		return edicaousuario;
	}
	
	@RequestMapping(value = "/movimentacaousuario/edicaousuario", method = RequestMethod.POST)
	public ModelAndView edicaoUsuario(HttpServletRequest request, Usuario user) {
		
		long id = Long.parseLong(request.getParameter("id"));
		
		 usuarioDao.editar(id, user);
				
			return new ModelAndView("redirect:/movimentacaousuario");
	}
	
	@RequestMapping(value = "/movimentacaousuario/delete", method = RequestMethod.GET)
	public ModelAndView deleteUsuario(HttpServletRequest request) {
		
		
		long id = Long.parseLong(request.getParameter("id"));
		usuarioDao.delete(id);
				
		return new ModelAndView("redirect:/movimentacaousuario");
	}
	
	
	
}
