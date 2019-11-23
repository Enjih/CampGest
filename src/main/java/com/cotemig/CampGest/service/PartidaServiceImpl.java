package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.PartidaDAO;
import com.cotemig.CampGest.model.Partida;

@Service("partidaService")
public class PartidaServiceImpl implements PartidaService {
	@Autowired
	PartidaDAO partidaDAO;

	@Override
	public Optional<Partida> getPartidaById(Integer id) {
		return partidaDAO.findById(id);
	}

	@Override
	public List<Partida> getAllPartidas() {
		return partidaDAO.findAll();
	}

	@Override
	public void deleteAllPartidas() {
		partidaDAO.deleteAll();
		
	}

	@Override
	public void deletePartidaById(Integer id) {
		partidaDAO.deleteById(id);
		
	}

	@Override
	public void updatePartidaById(Integer id, Partida partida) {
		Optional<Partida> getPartida = getPartidaById(id);
		getPartida.get().setCod_partida(partida.getCod_partida());
		getPartida.get().setCod_campeonato(partida.getCod_campeonato());
		getPartida.get().setCod_estadio(partida.getCod_estadio());
		getPartida.get().setTimeVencedor(partida.getTimeVencedor());
		getPartida.get().setCod_time1(partida.getCod_time1());
		getPartida.get().setCod_time2(partida.getCod_time2());
		getPartida.get().setGol_time1(partida.getGol_time1());
		getPartida.get().setGol_time2(partida.getGol_time2());
		getPartida.get().setNome_estadio(partida.getNome_estadio());
		getPartida.get().setNome_campeonato(partida.getNome_campeonato());
		getPartida.get().setData_partida(partida.getData_partida());
		getPartida.get().setCod_arbitro(partida.getCod_arbitro());

		partidaDAO.save(partida);		
		
	}

	@Override
	public void updatePartida(Partida partida) {
		partidaDAO.save(partida);
		
	}

	@Override
	public void insertPartida(Partida partida) {
		partidaDAO.save(partida);
		
	}

}
