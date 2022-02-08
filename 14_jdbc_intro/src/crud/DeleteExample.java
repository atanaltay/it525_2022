package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) {
		
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525login","root","e118528!")) {
			
			String query = "delete from users where username=?";
			
			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setString(1, "didem");
	
	
			
			//For all insert, update and delete queries:
			int numrows = psmt.executeUpdate();
					
			System.out.println("Deleted " + numrows + " rows..");
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
