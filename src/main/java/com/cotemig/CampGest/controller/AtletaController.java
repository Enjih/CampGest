package com.cotemig.CampGest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.CampGest.model.Atleta;
import com.cotemig.CampGest.service.AtletaService;
import com.cotemig.CampGest.service.TimeService;

@Controller
public class AtletaController {
	@Autowired
	private AtletaService atletaService;
	
	@Autowired
	private TimeService timeService;
	
	
	@RequestMapping(value = "/insertAtleta", method = RequestMethod.GET)
    public ModelAndView insertAtleta() {
		
        ModelAndView mav = new ModelAndView("insertAtleta");
        
        mav.addObject("atleta", new Atleta());
        mav.addObject("time", timeService.getAllTimes());
        
        return mav;
    }
	
	@RequestMapping(value = "/insertAtleta", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		atletaService.insertAtleta(atleta);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/excluirAtleta", method = RequestMethod.GET)
    public ModelAndView excluirAtleta(Integer id) {
		
		return new ModelAndView("excluirAtleta", "atleta", atletaService.getAtletaById(id).get());
		
		
    }
	
	@RequestMapping(value = "/excluirAtleta", method = RequestMethod.POST)
    public String submitExcluirAtleta(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		atletaService.deleteAtletaById(atleta.getCod_atleta());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/alterarAtleta", method = RequestMethod.GET)
    public ModelAndView alterarAtleta(Integer id) {
		
        return new ModelAndView("alterarAtleta", "atleta", atletaService.getAtletaById(id).get());
    }
	
	@RequestMapping(value = "/alterarAtleta", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("aluno")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		
		
		atletaService.updateAtleta(atleta);
        
        return "redirect:";
    }
	 	

}
