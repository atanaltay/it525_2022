package beans;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

public class SecureBEan {

	@Inject private UserBean userBean;
	
	
	
	public void init() {
		System.out.println("inittttttttttttttttt");
		if(!userBean.isLoggedin()) {
			
			HttpServletResponse resp = 
					(HttpServletResponse)FacesContext.getCurrentInstance()
					.getExternalContext().getResponse();
			
			
			try {
				System.out.println("Not logged in redirecting");
				resp.sendRedirect("error.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	public UserBean getUserBean() {
		return userBean;
	}
}
