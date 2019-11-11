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

import com.cotemig.CampGest.model.Time;
import com.cotemig.CampGest.service.TimeService;

@Controller
public class TimeController {
	
	@Autowired
	private TimeService timeService;
	
	@RequestMapping( value = "/Time", method = RequestMethod.GET) 
    public ModelAndView time(){
		ModelAndView mav = new ModelAndView("indexTime");
		
		mav.addObject("times", timeService.getAllTimes());
        
        return mav;
    }
	
	@RequestMapping(value = "/insertTime", method = RequestMethod.GET)
    public ModelAndView insertAtleta() {
		
        ModelAndView mav = new ModelAndView("insertTime");
        
        mav.addObject("time", new Time());
        
        return mav;
    }
	
	@RequestMapping(value = "/insertTime", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("time")Time time,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		timeService.insertTime(time);
        
        return "redirect:indexTime";
    }
	
	@RequestMapping(value = "/alterarTime", method = RequestMethod.GET)
    public ModelAndView alterarAtleta(Integer id) {		
        return new ModelAndView("alterarTime", "time", timeService.getTimeById(id).get());
    }
	
	@RequestMapping(value = "/alterarTime", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("time")Time time,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }		
		timeService.updateTime(time);        
        return "redirect:indexTime";
    }
	
	@RequestMapping(value = "/excluirTime", method = RequestMethod.GET)
    public ModelAndView excluirAtleta(Integer id) {		
		return new ModelAndView("excluirTime", "time", timeService.getTimeById(id).get());		
    }
	
	@RequestMapping(value = "/excluirTime", method = RequestMethod.POST)
    public String submitExcluirAtleta(@Valid @ModelAttribute("time")Time time,
      BindingResult result, ModelMap model) {        
		if (result.hasErrors()) {
            return "error";
        } 		
		timeService.deleteTimeById(time.getCod_time());        
		return "redirect:indexTime";
    }	
}
