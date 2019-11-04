package com.cotemig.CampGest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.CampGest.model.Time;

@Repository("timeDAO")
public interface TimeDAO extends JpaRepository<Time, Integer> {

}