package com.pluralsight.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbSingletonDemo2 {

	public static void main(String[] args) {
		DbSingletonDerby instance = DbSingletonDerby.getInstance();
		
		long timeBefore=0;
		long timeAfter=0;
		
		timeBefore = System.currentTimeMillis();	
		Connection conn = instance.getConnection();		
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		instance.normalDBUsage();
		
//		Statement stmt;		 
//	    // create table
//	    try {
//	    	stmt= conn.createStatement();
//	    	
//	    	// drop table
//	         stmt.executeUpdate("Drop Table users");
//	    	
//	         // create table
//	         stmt.executeUpdate("Create table users (id int primary key, name varchar(30))");
//	         System.out.println("table created");
//	         
//	         // insert 2 rows
//	         stmt.executeUpdate("insert into users values (1,'tom')");
//	         stmt.executeUpdate("insert into users values (2,'peter')");
//	      
//	         // query
//	         ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//	      
//	         // print out query result
//	         while (rs.next()) { 
//	           System.out.printf("%d\t%s\n", rs.getInt("id"), rs.getString("name"));
//	         }
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	    
	    timeBefore = System.currentTimeMillis();	
		conn = instance.getConnection();		
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
	    

	}

}
