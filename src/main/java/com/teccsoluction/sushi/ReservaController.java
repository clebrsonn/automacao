package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.ReservaDAO;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.entidade.Reserva;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ReservaController {
	
	@Autowired
	private ReservaDAO reservarDao;
	
	private List<Reserva>reservaList;
	
	
	
	
	@RequestMapping(value = "cadastroreserva", method = RequestMethod.GET)
	public ModelAndView cadastroReserva() {
		
		ModelAndView cadastroreserva = new ModelAndView("cadastroreserva");
		
		return cadastroreserva;
	}
	
	@RequestMapping(value = "/AddReserva", method = RequestMethod.POST)
	public ModelAndView AdicionarReserva(@ModelAttribute("Reserva") Reserva mesa) {
		
		ModelAndView cadastroreserva = new ModelAndView("cadastroreserva");
		
		reservarDao.add(mesa);
		
		return cadastroreserva;
	}

	
	@RequestMapping(value = "/movimentacaoreservas", method = RequestMethod.GET)
	public ModelAndView movimentacaoReservas() {
		
		ModelAndView movimentacaoreservas = new ModelAndView("movimentacaoreservas");
		
		
		reservaList = reservarDao.getAll();
		
		movimentacaoreservas.addObject("reservaList", reservaList);
		
		return movimentacaoreservas;
	}
	
	
	@RequestMapping(value = "/edicaoreserva", method = RequestMethod.GET)
	public ModelAndView editarReservaForm(HttpServletRequest request) {
		
		Reserva reserva;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaoreserva = new ModelAndView("edicaoreserva");
		reserva = reservarDao.PegarPorId(idf);
		edicaoreserva.addObject("reserva", reserva);
		
		
		return edicaoreserva;
	}
	
	
	@RequestMapping(value = "/movimentacaoreserva/edicaoreserva", method = RequestMethod.POST)
	public ModelAndView editarReserva(HttpServletRequest request, Reserva reserva) {
		
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		reservarDao.editar(idf, reserva);
		
		
		return new ModelAndView("redirect:/movimentacaoreserva");
	}
	
	
	
	@RequestMapping(value = "/movimentacaoreserva/delete", method = RequestMethod.GET)
	public ModelAndView deleteReserva(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		reservarDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaoreserva");
	}
	
}
