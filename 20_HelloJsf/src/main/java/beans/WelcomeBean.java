package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomeBean {

	
	private String name;
	
	//Action method
	//An action method returns a string with a NAVIGATION outcome.
	public String processForm() {
		
		System.out.println("Input name is:" + name);
		
		
		return "simpleformresult";		
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
