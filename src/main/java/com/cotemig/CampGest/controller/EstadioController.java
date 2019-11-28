package com.cotemig.CampGest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.CampGest.model.Estadio;
import com.cotemig.CampGest.service.EstadioService;


public class EstadioController {
	
	@Autowired
	private EstadioService estadioService;

	@RequestMapping(value="/Estadio", method = RequestMethod.GET)
    public ModelAndView indexArbitro(){
        ModelAndView mav = new ModelAndView("indexEstadio");
        
        mav.addObject("estadios", estadioService.getAllEstadios());
        
        return mav;
    
    }
	
	@RequestMapping(value = "/insertEstadio", method = RequestMethod.GET)
    public ModelAndView insertEstadio() {
		
        ModelAndView mav = new ModelAndView("insertEstadio");
        
        mav.addObject("estadio", new Estadio());
        
        return mav;
    }
	
	@RequestMapping(value = "/insertEstadio", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("estadio")Estadio estadio,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		estadioService.insertEstadio(estadio);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/excluirEstadio", method = RequestMethod.GET)
    public ModelAndView excluirestadio(Integer id) {
		
		return new ModelAndView("excluirEstadio", "estadio", estadioService.getEstadioById(id).get());		
    }
	
	@RequestMapping(value = "/excluirEstadio", method = RequestMethod.POST)
    public String submitExcluirestadio(@Valid @ModelAttribute("estadio")Estadio estadio,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		estadioService.deleteEstadioById(estadio.getCod_estadio());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/alterarEstadio", method = RequestMethod.GET)
    public ModelAndView alterarestadio(Integer id) {
		
        return new ModelAndView("alterarEstadio", "estadio", estadioService.getEstadioById(id).get());
    }
	
	@RequestMapping(value = "/alterarEstadio", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("aluno")Estadio estadio,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }	
		
		estadioService.updateEstadio(estadio);
        
        return "redirect:";
    }

}
