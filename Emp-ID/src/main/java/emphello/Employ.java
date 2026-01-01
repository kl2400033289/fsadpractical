package emphello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Employ {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hello";
		String user = "root";
		String password = "Hemu@3433";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established");
			String createemp="create table if not exists Employee("+ "emp_id int primary key auto_increment," + "emp_name varchar(20),"+"dep_id int,"+" foreign key(dep_id) REFERENCES Department(dep_id)"+")";
			Statement st = con.createStatement();
			st.execute(createemp);
			
			System.out.println("Table Created");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
