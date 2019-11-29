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
	
	@RequestMapping( value = "/Atleta", method = RequestMethod.GET) 
    public ModelAndView atleta(){
		ModelAndView mav = new ModelAndView("indexAtleta");
		
        mav.addObject("atletas", atletaService.getAllAtletas());
        mav.addObject("atleta", new Atleta());
		mav.addObject("times", timeService.getAllTimes());
        
        return mav;
    }
	
    @RequestMapping(value = "/insertAtleta", method = RequestMethod.GET)
    public ModelAndView insertAtleta() {
		
        ModelAndView mav = new ModelAndView("insertAtleta");

        mav.addObject("atleta", new Atleta());
        mav.addObject("times", timeService.getAllTimes());     

        return mav;
    }
	
    @RequestMapping(value = "/insertAtleta", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        //verifica se o time escolhido para o atleta possui mais de 24 jogadores
		if(atleta.getTime().getAtletas().size() > 23) {//caso tenha, retorna mensagem de erro
			return "Time escolhido tem 24 atletas";
			
		}else {//caso nao tenha, insere o atleta no banco, e insere o atleta na lista de atletas do time
			atletaService.insertAtleta(atleta);   	
			atleta.getTime().getAtletas().add(atleta); 	
			return "redirect:Atleta";
		}		             
    }
	
	@RequestMapping(value = "/excluirAtleta", method = RequestMethod.GET)
    public String excluirAtleta(Integer id) {	
        atletaService.deleteAtletaById(id);

        return "redirect:Atleta";
    }
	
//	@RequestMapping(value = "/excluirAtleta", method = RequestMethod.POST)
//    public String submitExcluirAtleta(@Valid @ModelAttribute("atleta")Atleta atleta,
//      BindingResult result, ModelMap model) {
//        
//		if (result.hasErrors()) {
//            return "error";
//        } 
//		
//		atletaService.deleteAtletaById(atleta.getCod_atleta());
//        
//		return "redirect:Atleta";
//    }
	
	@RequestMapping(value = "/alterarAtleta", method = RequestMethod.GET)
    public ModelAndView alterarAtleta(Integer id) {
		
        return new ModelAndView("alterarAtleta", "atleta", atletaService.getAtletaById(id).get());
    }
	
	@RequestMapping(value = "/alterarAtleta", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }		
		atletaService.updateAtleta(atleta);        
		return "redirect:Atleta";
    }
}
