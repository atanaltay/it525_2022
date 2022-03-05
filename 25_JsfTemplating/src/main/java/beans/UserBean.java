package beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class UserBean implements Serializable{

	private String username;
	private String password;
	private boolean loggedin;
	
	
	public String login() {
		
		if(username.equals("admin") && password.equals("1234")) {
			loggedin = true;
			return "home?faces-redirect=true";
			//Login success
		}else{
			

			FacesMessage msg = new FacesMessage("Username or password is wrong");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			
			
			
		}

		return null;
	}
	
	public String logout() {
		loggedin = false;
		username = null;
		password=null;
		return null;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isLoggedin() {
		return loggedin;
	}


	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
	}
	
	
	
}
