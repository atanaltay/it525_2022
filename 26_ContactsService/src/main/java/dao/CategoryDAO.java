package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import model.Category;

@SessionScoped
public class CategoryDAO implements BaseDAO<Category>, Serializable{

	@Override
	public List<Category> findAll() {
		List<Category> categories = new ArrayList<>();
		try (Connection conn = ConnectionManager.getConnection()){
		
		String query = "select * from category c";
		
		
			ResultSet rs = conn.prepareStatement(query).executeQuery();
			
			while(rs.next()){
				categories.add(new Category(rs.getInt("id"), rs.getString("name")));
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return categories;
	}

	@Override
	public Category findOneById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Category item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Category item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
