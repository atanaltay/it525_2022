package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.PersonDAO;
import model.Person;

@Named
@RequestScoped
public class AllContacts {

	
	private  List<Person> people = new ArrayList<Person>();
	
	
	
	@Inject private PersonDAO personDao;
	
	@PostConstruct
	public void init() {
		
		
		people = personDao.findAll();
		
		
	}
	
	public String deletePerson(int id) {
		
		System.out.println("Delete person, id: " + id);
		personDao.delete(id);
		people = personDao.findAll();
		return null;
	}
	
	
	public List<Person> getPeople() {
		return people;
	}
}
