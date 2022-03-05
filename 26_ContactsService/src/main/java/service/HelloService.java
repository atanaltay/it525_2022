package service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//(stateless, stateful, singleton)
@Stateless
@Path("/hello")
public class HelloService {

	@GET
	@Path("/sayhello")
	@Produces("text/plain")
	public String sayHello() {
		return "Hellloooo service..";
	}
	
	
}
