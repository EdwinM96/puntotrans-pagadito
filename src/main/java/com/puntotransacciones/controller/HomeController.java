/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Edwin
 */

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home");
    }
    
    @RequestMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }
    
}
