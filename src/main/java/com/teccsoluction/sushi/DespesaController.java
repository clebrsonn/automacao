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
//import com.teccsoluction.sushi.dao.DespesaDAO;
//import com.teccsoluction.sushi.entidade.Despesa;
//
//
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class DespesaController {
//	
//	@Autowired
//	private DespesaDAO despesaDao;
//	
//	private List<Despesa> despesaList;
//	
//	
//	
//	
//	@RequestMapping(value = "cadastrodespesa", method = RequestMethod.GET)
//	public ModelAndView cadastroDespesa() {
//		
//		ModelAndView cadastrodespesa = new ModelAndView("cadastrodespesa");
//		
//		return cadastrodespesa;
//	}
//	
//	@RequestMapping(value = "/AddDespesa", method = RequestMethod.POST)
//	public ModelAndView AdicionarDespesa(@ModelAttribute("Despesa") Despesa despesa) {
//		
//		ModelAndView cadastrodespesa = new ModelAndView("cadastrodespesa");
//		
//		despesaDao.add(despesa);
//		
//		return cadastrodespesa;
//	}
//	
//	@RequestMapping(value = "movimentacao_despesa", method = RequestMethod.GET)
//	public ModelAndView movimentacaoDespesa() {
//		
//		ModelAndView movimentacao_despesa = new ModelAndView("movimentacao_despesa");
//		
//		
//		despesaList = despesaDao.getAll();
//		
//		movimentacao_despesa.addObject("despesaList", despesaList);
//		
//		return movimentacao_despesa;
//	}
//	
//	@RequestMapping(value = "/edicaodespesa", method = RequestMethod.GET)
//	public ModelAndView editarDespesaForm(HttpServletRequest request) {
//		
//		Despesa despesa;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaodespesa = new ModelAndView("edicaodespesa");
//		despesa = despesaDao.PegarPorId(idf);
//		edicaodespesa.addObject("despesa", despesa);
//		
//		
//		return edicaodespesa;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaodespesa/edicaodespesa", method = RequestMethod.POST)
//	public ModelAndView editarDespesa(HttpServletRequest request, Despesa despesa) {
//		
//		
//		
//		Long idf = Long.parseLong(request.getParameter("id"));
//		despesaDao.editar(idf, despesa);
//		
//		
//		return new ModelAndView("redirect:/movimentacao_despesa");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaodespesa/delete", method = RequestMethod.GET)
//	public ModelAndView deleteDespesa(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
////		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
//		despesaDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/movimentacao_despesa");
//	}
//	
//}
