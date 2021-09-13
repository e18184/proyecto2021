/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping("uanadir.htm")
public class UanadirControler {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaUusuario() {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("uanadir");
            System.out.println("ingreso a añadir");
            return mav ;

	}

}
