package com.cotemig.CampGest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.CampGest.service.CampeonatoService;
import com.cotemig.CampGest.service.TimeService;

@Controller
public class CampeonatoController {
	@Autowired
	private CampeonatoService campeonatoService;
	
	@Autowired
	private TimeService timeService;
	
	@RequestMapping(value="/Campeonato", method = RequestMethod.GET)
    public ModelAndView TabelaCampeonato(){
        ModelAndView mav = new ModelAndView("indexCampeonato");
        
        mav.addObject("campeonatos", campeonatoService.getAllCampeonatos());
        mav.addObject("times", timeService.getAllTimes());
        
        
        return mav;
    
    }
	
	

}
