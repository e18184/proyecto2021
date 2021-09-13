/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador.matriculaestudianteparalelo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author richards
 */
public class ListarEstudianteMatriculaParalelo {
@RequestMapping("listarestudiantematriculaparalelo.htm")
public ModelAndView listarEstudianteMatriculaParalelo() {
/*     ModelAndView mov = new ModelAndView();
    try {
       
        Estudiante[] est = model.pojo.EstudianteDAO.listEstudianteByQuery(null,null);
       
        mov.addObject("datos",est);
        mov.setViewName("listarestudiantematriculaparalelo");
        
    } catch (PersistentException ex) {
        Logger.getLogger(ListarEstudianteMatriculaParalelo.class.getName()).log(Level.SEVERE, null, ex);
    }
*/
return null;
}
}

