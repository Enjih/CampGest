package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.CampGest.dao.TimeDAO;
import com.cotemig.CampGest.model.Time;

@Service("timeService")
public class TimeServiceImpl implements TimeService{
	@Autowired
	TimeDAO timeDAO;

	@Override
	public Optional<Time> getTimeById(Integer id) {
		return timeDAO.findById(id);
	}

	@Override
	public List<Time> getAllTimes() {		
		return timeDAO.findAll();
	}

	@Override
	public void deleteAllTimes() {
		timeDAO.deleteAll();		
	}

	@Override
	public void deleteTimeById(Integer id) {
		timeDAO.deleteById(id);
	}

	@Override
	public void updateTimeById(Integer id, Time time) {
		Optional<Time> getTime = getTimeById(id);
		getTime.get().setNome_time(time.getNome_time());
		
		timeDAO.save(time);				
	}

	@Override
	public void updateTime(Time time) {
		timeDAO.save(time);
	}

	@Override
	public void insertTime(Time time) {
		timeDAO.save(time);
	}
	

}
