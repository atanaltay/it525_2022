package service;

import java.util.List;

import dao.CategoryDAO;
import dao.PersonDAO;
import model.Category;
import model.Person;

public class AppService {
	
	
	public List<Category> getAllCategories(){
		
		
		return new CategoryDAO().findAll();
	}

	
	public List<Person> getAllContacts(){
		
		return new PersonDAO().findAll();
		
		
	}
	
	public List<Person> getContactsByCategoryId(int cat_id){
		
		return new PersonDAO().findByCategoryId(cat_id);
		
		
	}
	
	public int savePerson(Person p) {
		return new PersonDAO().save(p);
	}
	
	
}
