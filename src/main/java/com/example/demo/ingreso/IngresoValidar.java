
package com.example.demo.ingreso;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.example.demo.modelo.V_usuariorol;

import org.hibernate.PersistentObjectException;
import org.orm.PersistentException;


public class IngresoValidar implements Validator {

    @Override
    public boolean supports(Class<?> type) 
    {
        return V_usuariorol.class.isAssignableFrom(type);
       // return TuClase.class.isAssignableFrom(type);
    }
    
    public void validarUsuario (V_usuariorol rol,Errors errors) {
        
         List lista = null;
            /*System.out.println("No existen errores");
            System.out.println("Usuario: "+rol.getUsuario());
            System.out.println("Contrasena: "+rol.getContrasena());*/
        try {
            String condicion = "login = \'"+ rol.getLogin() + "\' AND password=\'"+rol.getPasswd()+"\'";
            
            lista = com.example.demo.modelo.V_usuariorolDAO.queryV_usuariorol(condicion," nombre DESC");
            try {
                rol = (V_usuariorol)lista.get(0);
                
            }
            catch (IndexOutOfBoundsException ex){
                 errors.rejectValue("login", "error.V_usuariorol.login", "Usuario incorrecto"); 
                errors.rejectValue("password", "error.V_usuariorol.password", "Contraseña incorrecta"); 
            
                
        }
               
           
        } catch (PersistentObjectException ex) {
            Logger.getLogger(IngresoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void validate(Object o,Errors errors) {
        
        V_usuariorol ingreso = (V_usuariorol)o;
        System.out.println("Usuario:"+ingreso.getLogin()+"dentro");
        System.out.println("Contrasena:"+ingreso.getPasswd()+"dentro");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login",
        "login.required", "Primer Mensaje Login");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
        "password.required", "Segundo Mensaje Password");
        this.validarUsuario(ingreso, errors);
        
    }
}