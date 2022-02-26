package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HomeBean {

	
	List<String> names = new ArrayList<String>();
	List<Product> products = new ArrayList<Product>();
	
	private String dirMessage = "Welcome clients to our page....";
	
	private boolean dirMsgEnabled = true;
	
	
	private String serverMessage = null;
	
	
	public HomeBean() {
		names.add("ali");
		names.add("veli");
		names.add("ali");
		names.add("ahmet");
		names.add("osman");
		names.add("veli");
		names.add("yavuz");
		names.add("veli");
		
		
		products.add(new Product(1, "iphone", 5000));
		products.add(new Product(2, "laptop", 5000));
		products.add(new Product(3, "mouse", 5000));
		
	}
	
	public String processBoxCall() {
		serverMessage = "message from server at " + new Date();
		
		
		return null;
		
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public String getDirMessage() {
		return dirMessage;
	}
	
	public boolean isDirMsgEnabled() {
		return dirMsgEnabled;
	}
	
	public String getServerMessage() {
		return serverMessage;
	}
	public List<String> getNames() {
		return names;
	}
}

