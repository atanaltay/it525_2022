package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.CategoryDAO;
import dao.PersonDAO;
import model.Category;
import model.Person;

@Named
@RequestScoped
public class NewContact {

	@Inject private PersonDAO personDao;
	@Inject private CategoryDAO catDao;

	private Person newPerson = new Person();
	
	private List<Category> categories = new ArrayList<>();	
	
	@PostConstruct
	public void init() {
		newPerson.setBirthdate("2000-01-01");
		
		categories = catDao.findAll();
		
		
	}
	
	public String savePerson() {
		
		personDao.save(newPerson);
		
		return "allcontacts";
	}
	
	public List<Category> getCategories() {
		return categories;
	}
	
	
	public Person getNewPerson() {
		return newPerson;
	}
	
}
