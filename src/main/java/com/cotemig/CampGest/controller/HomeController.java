package com.cotemig.CampGest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping( value = {"/", "/Home", "#"}) 
    public ModelAndView home(){        
        return new ModelAndView("index");
    }
}