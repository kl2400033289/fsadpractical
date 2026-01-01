package dephello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Depart {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hello";
		String user = "root";
		String password = "Hemu@3433";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established");
			String createDept="create table if not exists Department("+ "dep_id int primary key auto_increment," + "dep_name varchar(20)" + ")";
			Statement st = con.createStatement();
			st.executeUpdate(createDept);
			System.out.println("Department Table Created");
			String insertdept="insert into Employee(dep_id, dep_name) values ( ? , ?)";
			PreparedStatement ps = con.prepareStatement(insertdept);
			ps.setString(1, "Rahul");
				
			ps.executeUpdate();
			System.out.println("Department Row Created");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
