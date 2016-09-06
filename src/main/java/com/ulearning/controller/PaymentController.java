package com.ulearning.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.ulearning.service.PaymentService;

@Controller
//@RequestMapping("/lesson")
@Path("/payment")
public class PaymentController {

	@Autowired
	@Qualifier("paymentService")
	private PaymentService paymentService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ModelAndView findPayment(Model input) {
		return null;		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ModelAndView findPayments(Model input) {
		return null;		
	}
}
