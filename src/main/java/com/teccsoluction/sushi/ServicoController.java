package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.ServicoDAO;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Servico;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ServicoController {
	
	@Autowired
	private ServicoDAO servicoDao;
	
	private List<Servico> servicoList;
	
	
	
	
	@RequestMapping(value = "cadastroservico", method = RequestMethod.GET)
	public ModelAndView cadastroServico() {
		
		ModelAndView cadastroservico = new ModelAndView("cadastroservico");
		
		return cadastroservico;
	}
	
	@RequestMapping(value = "/AddServicos", method = RequestMethod.POST)
	public ModelAndView AdicionarServico(@ModelAttribute("Servico") Servico servico) {
		
		ModelAndView cadastroservico = new ModelAndView("cadastroservico");
		
		servicoDao.add(servico);
		
		return cadastroservico;
	}

	
	@RequestMapping(value = "/movimentacaoservico", method = RequestMethod.GET)
	public ModelAndView movimentacaoMesas() {
		
		ModelAndView movimentacaoservico = new ModelAndView("movimentacaoservico");
		
		servicoList = servicoDao.getAll();
		movimentacaoservico.addObject("servicoList", servicoList);
		
		return movimentacaoservico;
	}
	
	@RequestMapping(value = "/edicaoservico", method = RequestMethod.GET)
	public ModelAndView editarServicoForm(HttpServletRequest request) {
		
		Servico servico;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaoservico = new ModelAndView("edicaoservico");
		servico = servicoDao.PegarPorId(idf);
		edicaoservico.addObject("servico", servico);
		
		
		return edicaoservico;
	}
	
	
	@RequestMapping(value = "/movimentacaoservico/edicaoservico", method = RequestMethod.POST)
	public ModelAndView editarServico(HttpServletRequest request, Servico servico) {
		
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		servicoDao.editar(idf, servico);
		
		
		return new ModelAndView("redirect:/movimentacaoservico");
	}
	
	
	
	@RequestMapping(value = "/movimentacaoservico/delete", method = RequestMethod.GET)
	public ModelAndView deleteServico(HttpServletRequest request) {
		
		
		long id = Long.parseLong(request.getParameter("id"));
		servicoDao.delete(id);
		
		
		return new ModelAndView("redirect:/movimentacaoservico");
	}
	
}
