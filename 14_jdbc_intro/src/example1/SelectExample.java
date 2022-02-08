package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	
	public static void main(String[] args) {
		
		
	//1) Open Connection
	//2) Run Query
	//3)Close connection
		
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "e118528!")) {
			
			//Plain statement object to run a query
			Statement stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from country");
			
			while(rs.next()) {
				
				String code = rs.getString("code");
				String name = rs.getString("name");
				int population = rs.getInt("population");
				
				System.out.println(code + "--" + name + "--" + population);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
}
