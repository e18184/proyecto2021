/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.principal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.demo.modelo.Menus;
import com.example.demo.modelo.Roles;
import com.example.demo.modelo.Usuarios;
import com.example.demo.modelo.UsuariosDAO;

/**
 *
 * @author HAUSE
 */
@Controller
@SessionAttributes({"miusuario","seleccionadorol","rolseleccionado","mismenus"})
@RequestMapping("top.htm")
public class TopControler {
    
    
    @RequestMapping(value="/top.htm",method=RequestMethod.POST)
    
    public ModelAndView topControlerPost(@ModelAttribute("miusuario") Usuarios usuario, Model model,@RequestParam("idusu") int idusu)            
    {   
        System.out.println("Ingreso Aqui topcontroler");
        System.out.println("Valor de idrol:"+idusu);
        System.out.println("Valor de usuario"+usuario.getLogin());
        model.addAttribute("fmiusuario",usuario);
        
        //mav.addObject("rolseleccionado",u);
        ModelAndView mav = new ModelAndView("top");
        mav.addObject("seleccionado", idusu);
        mav.setViewName("top");
        return mav;
    }
    @RequestMapping(value="/top.htm",method=RequestMethod.GET)
    public ModelAndView topControlerGet(@ModelAttribute("miusuario") Usuarios usuario, Model model)            
    {   
        System.out.println("Ingreso Aqui topcontroler");
        model.addAttribute("fmiusuario",usuario);
        //mav.addObject("rolseleccionado",u);
        ModelAndView mav = new ModelAndView();
        
        mav.setViewName("top");
        return mav;
    }
     @ModelAttribute("misusuarios")
        public Map<String,String> lmisroles(@ModelAttribute("miusuario") Usuarios usuario)
        {
            Map <String,String> listado = new LinkedHashMap<>();
            for (Iterator iterator = usuario.codr.getIterator(); iterator.hasNext();) {
                Roles rol = (Roles)iterator.next();
               listado.put(Integer.toString(rol.getCodr()),rol.getNombre());             
            }
            return listado;
        }
     
        
}
