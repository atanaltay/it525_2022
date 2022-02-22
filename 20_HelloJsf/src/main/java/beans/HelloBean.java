package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//CDI Annotations
// JSF with CDI
//A sample request scoped managed bean
@Named
@RequestScoped
public class HelloBean {
	
	
	private String name = "Altug Tanaltay";
	
	
	public String getDefaultTestString() {
		return "default string....";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
