package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

	public static void main(String[] args) {
		
		
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525login","root","e118528!")) {
		
			String query = "insert into users (username,password,city) values (?,?,?)";
			
			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setString(1, "didem");
			psmt.setString(2, "1111");
			psmt.setString(3, "izmir");
			
			//For all insert, update and delete queries:
			int numrows = psmt.executeUpdate();
					
					System.out.println("Inserted " + numrows + " rows..");
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
