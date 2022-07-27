package com.pluralsight.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {

	public static void main(String[] args) {
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.createTable();
		
		jdbcFacade.insertIntoTable();
		
		List<Address> adresses = jdbcFacade.getAdresses();
		for (Address address : adresses) {
			System.out.println(address.getId() +" "+address.getCity()+" "+address.getStreetName() );
		}
		
	}

}
