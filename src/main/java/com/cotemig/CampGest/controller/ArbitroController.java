package com.cotemig.CampGest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.CampGest.model.Arbitro;
import com.cotemig.CampGest.service.ArbitroService;

public class ArbitroController {
	@Autowired
	private ArbitroService arbitroService;

	
	@RequestMapping(value = "/insertArbitro", method = RequestMethod.GET)
    public ModelAndView insertArbitro() {
		
        ModelAndView mav = new ModelAndView("insertArbitro");
        
        mav.addObject("arbitro", new Arbitro());
        
        return mav;
    }
	
	@RequestMapping(value = "/insertArbitro", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Arbitro")Arbitro arbitro,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		arbitroService.insertArbitro(arbitro);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/excluirArbitro", method = RequestMethod.GET)
    public ModelAndView excluirArbitro(Integer id) {		
		return new ModelAndView("excluirArbitro", "arbitro", arbitroService.getArbitroById(id).get());		
    }
	
	@RequestMapping(value = "/excluirArbitro", method = RequestMethod.POST)
    public String submitExcluirArbitro(@Valid @ModelAttribute("Arbitro")Arbitro arbitro,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		arbitroService.deleteArbitroById(arbitro.getCodigo_arbitro());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/alterarArbitro", method = RequestMethod.GET)
    public ModelAndView alterarArbitro(Integer id) {
		
        return new ModelAndView("alterarArbitro", "arbitro", arbitroService.getArbitroById(id).get());
    }
	
	@RequestMapping(value = "/alterarArbitro", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("aluno")Arbitro arbitro,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }		
		
		arbitroService.updateArbitro(arbitro);
        
        return "redirect:";
    }

}
