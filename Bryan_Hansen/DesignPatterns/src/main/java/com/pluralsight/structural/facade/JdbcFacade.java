package com.pluralsight.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
	
	DbSingletonDerby instance=null;

	public JdbcFacade() {
		instance = DbSingletonDerby.getInstance();
	}
	
	
	public int createTable() {
		int count=0;	
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			
	    	// drop table
			sta.executeUpdate("Drop Table ADDRESS");	
			
			count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
					+ "VARCHAR(20), City VARCHAR(20))");
			
			System.out.println("Table created.");
//			sta.close();
//			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	
	public int insertIntoTable() {
		int count=0;		
		try {
			Connection conn = instance.getConnection();			
			Statement sta = conn.createStatement();
			
			count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
					+ "values (1, '1234 Some street', 'Layton')");
			System.out.println(count + " record(s) created.");
//			sta.close();
//			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Address> getAdresses(){
		List<Address> addresses = new ArrayList<Address>();
			
		try {
			Connection conn = instance.getConnection();			
			Statement sta = conn.createStatement();
			
			ResultSet rs = sta.executeQuery("SELECT * FROM Address");
			
			while(rs.next()) {
//				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				Address address =  new Address();
				address.setId(rs.getString(1));
				address.setCity(rs.getString(2));
				address.setStreetName(rs.getString(3));
				
				addresses.add(address);
			}
			rs.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return addresses;
		
	}

}

class Address {	
	private String id;
	private String streetName;
	private String city;
	
	
	public String getId() {
		return id;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return city;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
