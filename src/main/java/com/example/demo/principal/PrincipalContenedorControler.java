/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value={"miusuario","seleccionadorol","rolseleccionado","mismenus"})
@Controller

@RequestMapping(value = "/")
public class PrincipalContenedorControler  {
    
    @RequestMapping(value="/principalcontenedor")
    public String principalControler() 
            
    {   
        
        System.out.println("ingreso principal contenedor");
        return "principalcontenedor";
    }
        
}
