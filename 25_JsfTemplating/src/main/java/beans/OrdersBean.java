package beans;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

@Named
@RequestScoped
public class OrdersBean{
	private String secureMessage = "Secure message text";
	
	@Inject private UserBean userBean;
	
	@PostConstruct
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
	
	
	public String getSecureMessage() {
		return secureMessage;
	}
	

}
