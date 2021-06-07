package com.kodlama.hibarnateandJPA.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodlama.hibarnateandJPA.DataAccess.ICityDal;
import com.kodlama.hibarnateandJPA.entities.City;
@Service
public class CityManager implements ICityService {

	
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		super();
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		this.cityDal.update(city);
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		this.cityDal.delete(city);
	}

	@Override
	public City getById(int id) {
		// TODO Auto-generated method stub
		return this.cityDal.getById(id);
	}
	
}
