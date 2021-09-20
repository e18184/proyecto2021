package com.example.demo.controlador;

import org.springframework.web.servlet.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("estudiante")
public class EstudianteControlador {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaEstudiantes() {
		// TODO - implement EstudianteControlador.listaEstudiantes
		throw new UnsupportedOperationException();
	}

	@ModelAttribute("diasemana")
	public java.util.Map<String, String> listadodiasemana() {
            return null;

	}

	/**
	 * 
	 * @param es
	 */

}