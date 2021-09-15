package com.example.demo.controlador;

import org.springframework.web.servlet.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("persona2.jsp")
public class PersonaControlador {

	
	PersonaControlador() {
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaEstudiantes() {
		// esto es una prue a de nuevo
		// TODO - implement PersonaControlador.listaEstudiantes
		throw new UnsupportedOperationException();
	}

	
}