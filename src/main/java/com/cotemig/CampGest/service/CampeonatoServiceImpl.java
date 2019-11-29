package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.CampeonatoDAO;
import com.cotemig.CampGest.model.Campeonato;

@Service("campeonatoService")
public class CampeonatoServiceImpl implements CampeonatoService{

	@Autowired
	CampeonatoDAO campeonatoDAO;
	
	@Override
	public Optional<Campeonato> getCampeonatoById(Integer id) {
		return campeonatoDAO.findById(id);
		
	}

	@Override
	public List<Campeonato> getAllCampeonatos() {
		return campeonatoDAO.findAll();
	}

	@Override
	public void deleteAllCampeonatos() {
		campeonatoDAO.deleteAll();
		
	}

	@Override
	public void deleteCampeonatoById(Integer id) {
		campeonatoDAO.deleteById(id);
		
	}

	@Override
	public void updateCampeonatoById(Integer id, Campeonato campeonato) {
		Optional<Campeonato> getCampeonato = getCampeonatoById(id);
		getCampeonato.get().setCod_campeonato(campeonato.getCod_campeonato());
		getCampeonato.get().setNome_campeonato(campeonato.getNome_campeonato());
		getCampeonato.get().setDtaInicio_campeonato(campeonato.getDtaInicio_campeonato());
		getCampeonato.get().setDtaFinal_campeonato(campeonato.getDtaFinal_campeonato());
		
		campeonatoDAO.save(campeonato);	
	}

	@Override
	public void updateCampeonato(Campeonato campeonato) {
		campeonatoDAO.save(campeonato);
		
	}

	@Override
	public void insertCampeonato(Campeonato campeonato) {
		campeonatoDAO.save(campeonato);
		
	}

}
