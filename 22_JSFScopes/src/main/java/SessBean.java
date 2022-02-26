import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessBean implements Serializable{

	
	private String username;
	
	
	public SessBean() {
		System.out.println("Session Constructor call....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Session post construct called....");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Session Destroy........");
	}
	
	
	public String processLogin() {
		
		System.out.println("Session Process login.....");
		
		
		return null;
		
		
	}
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
}
