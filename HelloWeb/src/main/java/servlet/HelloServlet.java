package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			

		
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		
		
			
			System.out.println("Servlet doGet called...");
			
			PrintWriter writer =resp.getWriter();
			writer.write("<html>");
			writer.write("<h2>");
			writer.write("Hello " + name  + " " + lastname);
			writer.write("</h2>");
			writer.write("</html>");
			writer.flush();
		
		
		}
	
	
	
	
}
