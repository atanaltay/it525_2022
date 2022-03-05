package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import model.Category;
import model.Person;

@SessionScoped
public class PersonDAO implements BaseDAO<Person>, Serializable{

	@Override
	public List<Person> findAll() {
List<Person> people = new ArrayList<>();
		
		try(Connection conn = ConnectionManager.getConnection()){
		
		String query = "select * from person p";
		
	
			
			PreparedStatement psmt = conn.prepareStatement(query);

			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				people.add(new Person(rs.getInt("id"), 
						rs.getString("name"), rs.getString("lastname"), 
						 rs.getString("workphone"), rs.getString("homephone"), 
						 rs.getString("address"), 
						 rs.getString("email"), 
						 rs.getString("city"), 
						 rs.getString("birthdate"), rs.getInt("category_id")));
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
	}

	@Override
	public Person findOneById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person item) {
		try(Connection conn = ConnectionManager.getConnection()){
		String query = "update person set name=?, lastname=?, workphone=?, category_id=?, address=?, homephone=?, email=?, city=?,birthdate=? where id=?";
	
			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setString(1, item.getName());
			psmt.setString(2, item.getLastname());
			psmt.setString(3, item.getWorkphone());
			psmt.setInt(4, item.getCategry_id());
			psmt.setString(5, item.getAddress());
			psmt.setString(6, item.getHomephone());
			psmt.setString(7, item.getEmail());
			psmt.setString(8, item.getCity());
			Date dt = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(item.getBirthdate()).getTime());
			psmt.setDate(9,dt);
			psmt.setInt(10, item.getId());
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void save(Person item) {
		
		try(Connection conn = ConnectionManager.getConnection()){
		String query = "insert into person (name,lastname,workphone,category_id,address,homephone,email,city,birthdate) values(?,?,?,?,?,?,?,?,?)";

			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setString(1, item.getName());
			psmt.setString(2, item.getLastname());
			psmt.setString(3, item.getWorkphone());
			psmt.setInt(4, item.getCategry_id());
			psmt.setString(5, item.getAddress());
			psmt.setString(6, item.getHomephone());
			psmt.setString(7, item.getEmail());
			psmt.setString(8, item.getCity());
			
			Date dt = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(item.getBirthdate()).getTime());
			psmt.setDate(9,dt);
			
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public List<Person> findPeopleByCategoryId(int catid){
		List<Person> people = new ArrayList<>();
		
		try(Connection conn = ConnectionManager.getConnection()){
		
		String query = "select * from person p where p.category_id=?";
		
	
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, catid);
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				people.add(new Person(rs.getInt("id"), 
						rs.getString("name"), rs.getString("lastname"), 
						 rs.getString("workphone"), rs.getString("homephone"), 
						 rs.getString("address"), 
						 rs.getString("email"), 
						 rs.getString("city"), 
						 rs.getString("birthdate"), rs.getInt("category_id")));
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
		
		
		
	}

	@Override
	public void delete(int id) {
		try (Connection conn = ConnectionManager.getConnection()) {
			String query = "delete from person where id=?";
		
		
			PreparedStatement psmt = conn.prepareStatement(query);
			
			psmt.setInt(1, id);

			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
