package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.ArbitroDAO;
import com.cotemig.CampGest.model.Arbitro;


@Service("arbitroService")
public class ArbitroServiceImpl implements ArbitroService {
	@Autowired
	ArbitroDAO arbitroDAO;
	
	@Override
	public Optional<Arbitro> getArbitroById(Integer id) {
		return arbitroDAO.findById(id);
	}
	
	@Override
	public List<Arbitro> getAllArbitros() {		
		return arbitroDAO.findAll();
	}

	
	
	
	@Override
	public void deleteAllArbitros() {
		arbitroDAO.deleteAll();		
	}

	@Override
	public void deleteArbitroById(Integer id) {
		arbitroDAO.deleteById(id);
	}

	@Override
	public void updateArbitroById(Integer id, Arbitro arbitro) {
		Optional<Arbitro> getArbitro = getArbitroById(id);
		getArbitro.get().setNome_arbitro(arbitro.getNome_arbitro());
		
		arbitroDAO.save(arbitro);				
	}

	@Override
	public void updateArbitro(Arbitro arbitro) {
		arbitroDAO.save(arbitro);
	}

	@Override
	public void insertArbitro(Arbitro arbitro) {
		arbitroDAO.save(arbitro);
	}
	


}
