package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.AtletaDAO;
import com.cotemig.CampGest.model.Atleta;

@Service("atletaService")
public class AtletaServiceImpl implements AtletaService{
	
	@Autowired
	AtletaDAO atletaDAO; 

	@Override
	public Optional<Atleta> getAtletaById(Integer id) {
		return atletaDAO.findById(id);
	}

	@Override
	public List<Atleta> getAllAtletas() {
		return atletaDAO.findAll();
	}

	@Override
	public void deleteAllAtletas() {
		atletaDAO.deleteAll();		
	}

	@Override
	public void deleteAtletaById(Integer id) {
		atletaDAO.deleteById(id);
	}

	@Override
	public void updateAtletaById(Integer id, Atleta atleta) {
		Optional<Atleta> getAtleta = getAtletaById(id);
		getAtleta.get().setNome_atleta(atleta.getNome_atleta());
		getAtleta.get().setTime(atleta.getTime());
		
		atletaDAO.save(atleta);		
	}

	@Override
	public void updateAtleta(Atleta atleta) {
		atletaDAO.save(atleta);		
	}

	@Override
	public void insertAtleta(Atleta atleta) {
		atletaDAO.save(atleta);		
	}
}
