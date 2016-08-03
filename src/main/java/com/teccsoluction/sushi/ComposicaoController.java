//package com.teccsoluction.sushi;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import com.teccsoluction.sushi.dao.ComposicaoDAO;
//import com.teccsoluction.sushi.entidade.Composicao;
//import com.teccsoluction.sushi.entidade.Servico;
//
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class ComposicaoController {
//	
//	@Autowired
//	private ComposicaoDAO composicaoDao;
//	
//	private List<Composicao> composicaoList;
//	
//	
//	
//	
//	@RequestMapping(value = "cadastrocomposicao", method = RequestMethod.GET)
//	public ModelAndView cadastroComposicao() {
//		
//		ModelAndView cadastrocomposicao = new ModelAndView("cadastrocomposicao");
//		
//		return cadastrocomposicao;
//	}
//	
//	@RequestMapping(value = "/ADDComposicao", method = RequestMethod.POST)
//	public ModelAndView AdicionarComposicao(@ModelAttribute("Composicao") Composicao composicao) {
//		
//		ModelAndView cadastro_composicao = new ModelAndView("cadastrocomposicao");
//		
//		composicaoDao.add(composicao);
//		
//		return cadastro_composicao;
//	}
//
//	@RequestMapping(value = "/movimentacaocomposicao", method = RequestMethod.GET)
//	public ModelAndView movimentacaoComposicao() {
//		
//		ModelAndView movimentacaocomposicao = new ModelAndView("movimentacaocomposicao");
//		
//		composicaoList = composicaoDao.getAll();
//		
//		movimentacaocomposicao.addObject("composicaoList", composicaoList);
//		
//		return movimentacaocomposicao;
//	}
//	
//	
//	@RequestMapping(value = "/edicaocomposicao", method = RequestMethod.GET)
//	public ModelAndView editarComposicaoForm(HttpServletRequest request) {
//		
//		Composicao composicao;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaocomposicao = new ModelAndView("edicaocomposicao");
//		composicao = composicaoDao.PegarPorId(idf);
//		edicaocomposicao.addObject("composicao", composicao);
//		
//		
//		return edicaocomposicao;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaocomposicao/edicaocomposicao", method = RequestMethod.POST)
//	public ModelAndView editarComposicao(HttpServletRequest request, Composicao composicao) {
//		
//		
//		
//		Long idf = Long.parseLong(request.getParameter("id"));
//		composicaoDao.editar(idf, composicao);
//		
//		
//		return new ModelAndView("redirect:/movimentacaocomposicao");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaocomposicao/delete", method = RequestMethod.GET)
//	public ModelAndView deleteComposicao(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		composicaoDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/movimentacaocomposicao");
//	}
//	
//}
