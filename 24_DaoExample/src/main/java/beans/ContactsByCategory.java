package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import dao.CategoryDAO;
import dao.PersonDAO;
import model.Category;
import model.Person;

@Named
@RequestScoped
public class ContactsByCategory {

	
	@Inject CategoryDAO catDao;
	@Inject PersonDAO personDao;
	
	private List<Person> people =  new ArrayList<>();
	private List <Category> categories = new ArrayList<>();
	
	private Person newPerson = new Person();
	
	
	@PostConstruct
	
	public void init() {
		categories = catDao.findAll();
		newPerson.setBirthdate("2000-01-01");
		refreshData();
		
		
		
	}
	
	public void refreshData() {
		HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		if(req.getParameter("catid")!=null && !req.getParameter("catid").equals("")) {
			//System.out.println("----- Cat id is " + req.getParameter("catid"));
			int catid = Integer.valueOf(req.getParameter("catid"));
			people = personDao.findPeopleByCategoryId(catid);
			System.out.println("By category....");
			
		}else {
			people = personDao.findAll();
			System.out.println("All people....");
		}
		
	}
	
	public String savePerson() {
		//Page is forwarded
		personDao.save(newPerson);
		//refreshdata is removed as the page is redirected to itself
		//refreshData();
		return "categorycontacts?faces-redirect=true";
	}
	
	
	
	public String deletePerson(int id) {
		
		personDao.delete(id);
		refreshData();
		return null;
		
		
		
	}
	
	public Person getNewPerson() {
		return newPerson;
	}
	
	public List<Person> getPeople() {
		return people;
	}
	
	public List<Category> getCategories() {
		return categories;
	}
	
}
