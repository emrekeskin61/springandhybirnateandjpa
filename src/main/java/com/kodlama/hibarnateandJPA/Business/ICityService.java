package com.kodlama.hibarnateandJPA.Business;

import java.util.List;

import com.kodlama.hibarnateandJPA.entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
