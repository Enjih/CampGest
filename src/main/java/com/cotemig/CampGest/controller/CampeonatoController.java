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

import com.cotemig.CampGest.model.Rodada;
import com.cotemig.CampGest.model.Time;
import com.cotemig.CampGest.service.CampeonatoService;
import com.cotemig.CampGest.service.RodadaService;
import com.cotemig.CampGest.service.TimeService;

@Controller
public class CampeonatoController {
	@Autowired
	private CampeonatoService campeonatoService;

	@Autowired
	private TimeService timeService;
	
	@Autowired
	private RodadaService rodadaService;

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
		mav.addObject("novarodada", new Rodada());

		return mav;		
	}
	@RequestMapping(value = "/rodadasCampeonato", method = RequestMethod.POST)
	public String submitRodadasCampeonato(@Valid @ModelAttribute("novarodada")Rodada rodada,
			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		
		rodada.setCod_rodada(1);
		rodada.setCampeonato_rodada(campeonatoService.getCampeonatoById(1).get());
		
		
		
		
		Time m[][] = new Time[2][5];
		int b = 0;
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				m[i][j] = timeService.getAllTimes().get(b);
			}
		}
		b = 0;
		
		Time t[] = new Time[2];

		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				
				t[0] = m[0][0];
				t[1] = m[i][j];
				rodadaService.getRodadaById(rodada.getCod_rodada()).get().getPartidas().get(b).setTime1(t[0]);

				rodadaService.getRodadaById(rodada.getCod_rodada()).get().getPartidas().get(b).setTime2(t[1]);
				
				
			}
		}
		
		return "redirect:Usuario";
	}

	@RequestMapping(value="/rodadasPartida", method = RequestMethod.GET)
	public ModelAndView rodadasPartida(Integer id){
		ModelAndView mav = new ModelAndView("indexRodadasPartida",
				"partidas",
				campeonatoService.getCampeonatoById(1).get().getRodadas().get(id).getPartidas());      

		return mav;		
	}
}
