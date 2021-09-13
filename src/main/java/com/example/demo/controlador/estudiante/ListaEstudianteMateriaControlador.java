/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador.estudiante;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.demo.modelo.Usuarios;
@RequestMapping("listaestudiantemateria.htm")
// queremos recurpear una variable sesionado  nombre, apellido
// me permite recuperar variables sesionadas
@SessionAttributes({"miusuario"})
public class ListaEstudianteMateriaControlador {    
    @RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaEstudianteMateria(@ModelAttribute("miusuario") Usuarios usuario,
                Model model) {
            ModelAndView mav = new ModelAndView();
            
            model.addAttribute("visualizar",usuario);
            
            mav.setViewName("listaestudiantemateria");
            
            return mav ;

	}
}
