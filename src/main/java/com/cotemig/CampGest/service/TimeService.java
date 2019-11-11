package com.cotemig.CampGest.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.CampGest.model.Time;

public interface TimeService {
	
	Optional<Time> getTimeById(Integer id);
	List<Time> getAllTimes();
	void deleteAllTimes();
	void deleteTimeById(Integer id);
	void updateTimeById(Integer id, Time Time);
	void updateTime(Time Time);
	void insertTime(Time Time);

}
