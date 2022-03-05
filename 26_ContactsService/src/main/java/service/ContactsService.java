package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import dao.PersonDAO;
import model.ContactRequest;
import model.Person;

@Stateless
@Path("/contacts")
public class ContactsService {

	@Inject PersonDAO personDAO;
	
	
	@GET
	@Path("/all")
	@Produces("application/JSON")
	public List<Person> getAllContacts(){
		
		return personDAO.findAll();
		
	}
	
	@GET
	@Path("/bycategory/{catid}")
	@Produces("application/JSON")
	public List<Person> getContatcsByCategory(@PathParam("catid") int catid){
		
		
		return personDAO.findPeopleByCategoryId(catid);
		
		
	}
	
	@POST
	@Path("/bycategory2")
	@Produces("application/JSON")
	@Consumes("application/JSON")
	public List<Person> getContatcsByCategory2(ContactRequest req){
		
		
		return personDAO.findPeopleByCategoryId(req.getCatid());
		
		
	}
	
}
