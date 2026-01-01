package com.klu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCreate {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hello";
		String user = "root";
		String password = "Hemu@3433";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established");
			String query="create table if not exists Student ("+ "id int primary key auto_increment," + "name varchar(20)"+")";
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("Table Created");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
