package service;

import java.util.List;

import dao.CategoryDAO;
import model.Category;

public class AppService {
	
	
	public List<Category> getAllCategories(){
		
		
		return new CategoryDAO().findAll();
	}

}
