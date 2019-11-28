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
        
        mav.addObject("campeonato", campeonatoService.getCampeonatoById(1).get());
        mav.addObject("times", timeService.getAllTimes());        
        
        return mav;    
    }
	
	@RequestMapping(value="/tabelaCampeonato", method = RequestMethod.GET)
    public ModelAndView tabelaCampeonato(){
        return new ModelAndView("tabelaCampeonato");
    }

	@RequestMapping(value="/rodadasCampeonato", method = RequestMethod.GET)
    public ModelAndView rodadasCampeonato(){
        ModelAndView mav = new ModelAndView("indexRodada");
        
        mav.addObject("campeonato", campeonatoService.getCampeonatoById(1).get());
        mav.addObject("rodadas", campeonatoService.getCampeonatoById(1).get().getRodadas());        
        
        return mav;		
    }
	
	@RequestMapping(value="/rodadasPartida", method = RequestMethod.GET)
    public ModelAndView rodadasPartida(Integer id){
        ModelAndView mav = new ModelAndView("indexRodadasPartida",
        		"partidas",
        		campeonatoService.getCampeonatoById(1).get().getRodadas().get(id).getPartidas());      
        
        return mav;		
    }
}
