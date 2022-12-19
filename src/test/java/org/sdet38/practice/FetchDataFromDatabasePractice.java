package org.sdet38.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabasePractice {

	public static void main(String[] args) throws SQLException {
		//Create the object for DB driver class
		Driver dbDriver=new Driver();
		//register the driver to the JDBC
		DriverManager.registerDriver(dbDriver);
		Connection connection=null;
		try {
			//get or estrablish the connection 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sdet38", "root", "root");
			//create the statement
			Statement statement = connection.createStatement();
			//execute the query
			statement.executeUpdate("create table EmpDetails(empId int(4) not null unique, empName varchar(30), phone_number int(10) not null unique, Address varchar(50));");
			System.out.println("Data updated successfully");
		}
		finally{
			//close the connection
			connection.close();
			System.out.println("connection closed");
		}

	}
}
