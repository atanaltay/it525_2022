package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;

public class CategoryDAO implements BaseDAO<Category>{

	@Override
	public List<Category> findAll() {
		List<Category> categories =new ArrayList<Category>();

		
		try (Connection connection = ConnectionManager.getConnection()){
			
			String query = "select * from category";
			
			PreparedStatement psmt = connection.prepareStatement(query);
			
			 ResultSet rs = psmt.executeQuery();
			 
			 
			 while(rs.next()) {
				 Category cat = new Category(rs.getInt("id"),rs.getString("name"));
				 categories.add(cat);
				 
				 
			 }
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return categories;
		
		
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Category item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(Category item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Category item) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
