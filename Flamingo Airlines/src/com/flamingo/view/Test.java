package com.flamingo.view;

import com.flamingo.controller.services.CityServices;
import com.flamingo.controller.services.CityServicesImpl;
import com.flamingo.model.City;

public class Test {

	public static void main(String[] args) {
		
		CityServicesImpl cityServices = new CityServicesImpl();
		City city = new City(101,"Indore","M.P.","India",452001);
		cityServices.insertCity(city);
		
		
	}
}
