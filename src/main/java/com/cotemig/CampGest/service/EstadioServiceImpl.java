package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.EstadioDAO;
import com.cotemig.CampGest.model.Estadio;

@Service("estadioService")
public class EstadioServiceImpl implements EstadioService {
	
	@Autowired
	EstadioDAO estadioDAO;

	@Override
	public Optional<Estadio> getEstadioById(Integer id) {
		return estadioDAO.findById(id);
	}

	@Override
	public List<Estadio> getAllEstadios() {
		return estadioDAO.findAll();
	}

	@Override
	public void deleteAllEstadios() {
		estadioDAO.deleteAll();
		
	}

	@Override
	public void deleteEstadioById(Integer id) {
		estadioDAO.deleteById(id);
		
	}

	@Override
	public void updateEstadioById(Integer id, Estadio estadio) {
		Optional<Estadio> getEstadio = getEstadioById(id);
		getEstadio.get().setCod_estadio(estadio.getCod_estadio());
		getEstadio.get().setCidade_estadio(estadio.getCidade_estadio());
		getEstadio.get().setNome_estadio(estadio.getNome_estadio());
		
		estadioDAO.save(estadio);	
	}

	@Override
	public void updateEstadio(Estadio estadio) {
		estadioDAO.save(estadio);
		
	}

	@Override
	public void insertEstadio(Estadio estadio) {
		estadioDAO.save(estadio);
		
	}


}
