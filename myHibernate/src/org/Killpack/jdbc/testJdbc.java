package org.Killpack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJdbc {

	public static void main(String[] args) {
		
		//hb_student_tracker is the name of a database created in mysql
		String jdbcUrl = "jdbc:mysql://localhost:3306/Customer?useSSL=false";
		
		//username and password of user we created on the hb_student_tracker database
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try{
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful!");
			
		}
		catch (Exception ex){
			ex.printStackTrace();
		}

	}

}
