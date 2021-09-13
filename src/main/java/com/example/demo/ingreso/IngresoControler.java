/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.ingreso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import com.example.demo.modelo.V_usuariorol;
import com.example.demo.modelo.Usuarios;
import com.example.demo.modelo.UsuariosDAO;
import com.example.demo.modelo.Roles;
import com.example.demo.modelo.Menus;
import com.example.demo.modelo.Procesos;
import org.orm.PersistentException;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
// las variables sesionadas, son aquellas que yo qu
// que sus valores se preserven, al pasar de un controlador
// a otro
@SessionAttributes({"mismenus","miusuario","rolseleccionado"})
@RequestMapping("/usuario.jsp")
public class IngresoControler {
    private IngresoValidar ingresovalidar;
    private Usuarios pusuario= new Usuarios();


    
    public IngresoControler(){
        this.ingresovalidar = new IngresoValidar();
    }
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView usuarioGet() 
            
    {   
        ModelAndView mav =new ModelAndView();
        mav.setViewName("usuario");
        V_usuariorol p = new V_usuariorol();
        
        
        mav.addObject("V_usuariorol",p);
        
        System.out.println("se cargo el formulario");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    
    public ModelAndView usuarioPost(
            @ModelAttribute("V_usuariorol") V_usuariorol rol,
            BindingResult result,
            SessionStatus status
    ) throws PersistentException {
        System.out.print(rol);
        this.ingresovalidar.validate(rol, result);
        //System.out.print(rol.getLogin()+"---");
        //System.out.print(rol.getPassword()+"--");
       
        List lista = null;
        String condicion = "login = \'"+ rol.getLogin() + "\' AND password=\'"+rol.getPasswd()+"\'";
            //lista = model.pojo.VlistarolesDAO.queryVlistaroles(condicion," nombre DESC");
            lista = com.example.demo.modelo.V_usuariorolDAO.queryV_usuariorol(condicion," unombre DESC");
            V_usuariorol roldevolver = null;
            // ModelAndView mav = new ModelAndView();
                     
            try {
                roldevolver = (V_usuariorol)lista.get(0);           
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("hola");
            }
              
        
        
        String direccion = null;
        ModelAndView  mav2 = new ModelAndView("usuario");
        
    
        if (result.hasErrors()) 
        {
        mav2.setViewName("usuario");
        return mav2;
        }   Menus m = null;
            Procesos p = null;
            Usuarios u =  (Usuarios)UsuariosDAO.getUsuariosByORMID(roldevolver.getLogin());
            
            this.pusuario=u;
            Roles roles=null;
            List<Menus> smenus = new ArrayList<Menus>();
            List<Procesos> sprocesos = new ArrayList<Procesos>();
            
            // ROL 
            //for (Iterator iterator = u.idrol.getIterator(); iterator.hasNext();){
            
            
            roles=(Roles)u.getORM_Codr().iterator().next();
               
               
                // MENU
               for (Iterator iterator2 = roles.codm.getIterator(); iterator2.hasNext();){
                    
                    m = (Menus)iterator2.next();
                    System.out.println ("NOMBRE DEL MENU:"+m.getNombre());
                    smenus.add(m);
                        // PROCESOS 
                        for (Iterator iterator3 = m.codp.getIterator(); iterator3.hasNext();){              
                            p = (Procesos)iterator3.next();
                            System.out.println("nombre del proceso:"+p.getNombre());
                            sprocesos.add(p);
                        }
                        
               }
               
               
            //}
            
            
            
            mav2.setViewName("principalcontenedor");
            /*mav2.addObject("rol",u.idrol.getIterator());
            mav2.addObject("menus",roles.i);
            mav2.addObject("procesos",m.idpro.toArray());*/
            
            /*mav2.addObject("menus",smenus);
            
            mav2.addObject("procesos",sprocesos);*/
            
            mav2.addObject("miusuario",pusuario);
            mav2.addObject("mismenus",smenus);
              return mav2;
              
        }
       
    
}