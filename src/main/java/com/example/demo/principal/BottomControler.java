/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HAUSE
 */
@Controller
@RequestMapping("bottom.htm")
public class BottomControler {
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView principalControler() 
            
    {   
        ModelAndView mav =new ModelAndView();
        mav.setViewName("bottom");
        return mav;
    }
    
}
