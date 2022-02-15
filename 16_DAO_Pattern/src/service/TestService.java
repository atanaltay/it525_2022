package service;

public class TestService {

	public static void main(String[] args) {
		
		//Test AppService
		AppService srv = new AppService();
		
		srv.getAllContacts().forEach(p->System.out.println(p.getName()));
		
		
		
		
	}
	
	
	
	
}
