package com.algaworks.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuario/**")
public class UsuarioController {
	
	private static final String CADASTRO_VIEW = "usuario/novo";
	
	@RequestMapping("/novo") //digita esta url
	public ModelAndView novo() { //cai neste metodo
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		return mv; //retorna esta view
	}
	
}
