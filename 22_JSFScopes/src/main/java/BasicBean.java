import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BasicBean {

	
	private String username;
	
	
	public BasicBean() {
		System.out.println("Constructor call....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("post construct called....");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy........");
	}
	
	
	public String processLogin() {
		
		System.out.println("Process login.....");
		
		
		return null;
		
		
	}
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
}
