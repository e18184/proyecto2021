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
public class IngresoControler2 {

    
}