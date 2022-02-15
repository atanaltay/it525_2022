package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;
import model.Person;

public class PersonDAO implements BaseDAO<Person>{

	@Override
	public List<Person> findAll() {
		List<Person> people =new ArrayList<Person>();

		
		try (Connection connection = ConnectionManager.getConnection()){
			
			String query = "select * from person";
			
			PreparedStatement psmt = connection.prepareStatement(query);
			
			 ResultSet rs = psmt.executeQuery();
			 
			 
			 while(rs.next()) {
				 Person p = new Person(rs.getInt("id"),rs.getString("name"), rs.getString("lastname"),
						 rs.getString("workphone"), rs.getString("address"), rs.getString("homephone"), rs.getString("email"),
						 rs.getString("city"), rs.getString("birthdate"), rs.getInt("category_id"));
				
				 
				 people.add(p);
				 
				 
			 }
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
		
	}
	
	public List<Person> findByCategoryId(int category_id) {
		List<Person> people =new ArrayList<Person>();

		
		try (Connection connection = ConnectionManager.getConnection()){
			
			String query = "select * from person where category_id=?";
			
			PreparedStatement psmt = connection.prepareStatement(query);
			psmt.setInt(1, category_id);
			
			 ResultSet rs = psmt.executeQuery();
			 
			 
			 while(rs.next()) {
				 Person p = new Person(rs.getInt("id"),rs.getString("name"), rs.getString("lastname"),
						 rs.getString("workphone"), rs.getString("address"), rs.getString("homephone"), rs.getString("email"),
						 rs.getString("city"), rs.getString("birthdate"), rs.getInt("category_id"));
				
				 
				 people.add(p);
				 
				 
			 }
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
		
	}
	

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Person item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(Person item) {
		int result = 0;

		try (Connection conn = ConnectionManager.getConnection()) {
			
			String query = "insert into person(name,lastname,workphone,address,homephone,email,city,birthdate,category_id) values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, item.getName() );
			psmt.setString(2, item.getLastname() );
			psmt.setString(3, item.getWorkphone() );
			
			psmt.setString(4, item.getAddress() );
			psmt.setString(5, item.getHomephone() );
			psmt.setString(6, item.getEmail());
			psmt.setString(7, item.getCity() );
			
			//FIX THE DATE OPERATION
			Date brth = new Date(1980, 1, 1);
			psmt.setDate(8, brth );
		
			psmt.setInt(9, item.getCategry_id() );
			
			result = psmt.executeUpdate();
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}

	@Override
	public int delete(Person item) {
		// TODO Auto-generated method stub
		return 0;
	}

}
