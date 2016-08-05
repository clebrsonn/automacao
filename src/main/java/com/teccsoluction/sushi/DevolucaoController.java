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
//
//import com.teccsoluction.sushi.dao.DevolucaoDAO;
//import com.teccsoluction.sushi.dao.RecebimentoDAO;
//import com.teccsoluction.sushi.entidade.Devolucao;
//import com.teccsoluction.sushi.entidade.Recebimento;
//
//
//@Controller
//public class DevolucaoController {
//	
//	
//	@Autowired
//	private DevolucaoDAO devolucaoDao;
//	
//	private List<Devolucao> devolucaoList;
//
//	
//	
//	@RequestMapping(value = "cadastrodevolucao", method = RequestMethod.GET)
//	public ModelAndView cadastroDevolucao() {
//		
//		ModelAndView cadastrodevolucao = new ModelAndView("cadastrodevolucao");
//		
//		return cadastrodevolucao;
//	}
//	
//	@RequestMapping(value = "/AddDevolucao", method = RequestMethod.POST)
//	public ModelAndView AdicionarDevolucao(@ModelAttribute("Devolucao") Devolucao devolucao) {
//		
//		
//		devolucaoDao.add(devolucao);
//		
//		return new ModelAndView("redirect:/finalizacaodevolucao");
//	}
//
//	
//	@RequestMapping(value = "/movimentacaodevolucao", method = RequestMethod.GET)
//	public ModelAndView movimentacaoDevolucao() {
//		
//		ModelAndView movimentacaodevolucao = new ModelAndView("movimentacaodevolucao");
//		
//		devolucaoList = devolucaoDao.getAll();
//		
//		movimentacaodevolucao.addObject("devolucaoList", devolucaoList);
//		
//		return movimentacaodevolucao;
//	}
//	
//	
//	@RequestMapping(value = "/edicaodevolucao", method = RequestMethod.GET)
//	public ModelAndView editarDevolucaoForm(HttpServletRequest request) {
//		
//		Devolucao devolucao;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaodevolucao = new ModelAndView("edicaodevolucao");
//		devolucao = devolucaoDao.PegarPorId(idf);
//		edicaodevolucao.addObject("devolucao", devolucao);
//		
//		
//		return edicaodevolucao;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaodevolucao/edicaodevolucao", method = RequestMethod.POST)
//	public ModelAndView editarDevolucao(HttpServletRequest request, Devolucao devolucao) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		devolucaoDao.editar(idf, devolucao);
//		
//		
//		return new ModelAndView("redirect:/movimentacaodevolucao");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaodevolucao/delete", method = RequestMethod.GET)
//	public ModelAndView deleteDevolucao(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		devolucaoDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/movimentacaodevolucao");
//	}
//	
//
//}
