package com.kodlama.hibarnateandJPA.DataAccess;

import java.util.List;

import com.kodlama.hibarnateandJPA.entities.City;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
