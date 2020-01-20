package com.eventosapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class EventoController {

	@RequestMapping("/cadastrarEvento")
	public String form() {
		// TODO Auto-generated constructor stub
		return "evento/formEvento";
	}

}
