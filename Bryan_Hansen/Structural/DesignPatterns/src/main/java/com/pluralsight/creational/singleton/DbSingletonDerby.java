package com.pluralsight.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Using inMemory Derby DB
public class DbSingletonDerby{
	
	private String dbUrl = "jdbc:derby:..\\DesignPatterns\\MyDB\\demo;create=true";
	Connection conn;
	
	private static volatile DbSingletonDerby instance = null;
	
	private DbSingletonDerby() {		
		// Don't need to register, we can directly call getconnection()
		if (instance != null) {
			throw new RuntimeException("Use getINstance method to create");
		}
	};
	
	public  static DbSingletonDerby getInstance() {		
		if (instance == null) {
			synchronized(DbSingletonDerby.class) {
				if (instance == null) {
					instance = new DbSingletonDerby();
				}
			}
		}				
		return instance;
	}
	
	
	public Connection getConnection() {		
		if (conn == null) {
			synchronized(DbSingletonDerby.class) {
				if (conn == null) {
					try {			
					    conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}			
		
		return conn;
	}
	
	
	public void normalDBUsage() {
	Statement stmt;		 
    // create table
    try {
    	stmt= conn.createStatement();
    	
    	// drop table
         stmt.executeUpdate("Drop Table users");
    	
         // create table
         stmt.executeUpdate("Create table users (id int primary key, name varchar(30))");
         System.out.println("table created");
         
         // insert 2 rows
         stmt.executeUpdate("insert into users values (1,'tom')");
         stmt.executeUpdate("insert into users values (2,'peter')");
      
         // query
         ResultSet rs = stmt.executeQuery("SELECT * FROM users");
      
         // print out query result
         while (rs.next()) { 
           System.out.printf("%d\t%s\n", rs.getInt("id"), rs.getString("name"));
         }
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
  }
	
}
