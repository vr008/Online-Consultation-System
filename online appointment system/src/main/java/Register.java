
import jakarta.servlet.http.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  	
		PrintWriter pw=response.getWriter();
		int a=Integer.parseInt(request.getParameter("user1"));
		  if(a==1){  
		        RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");  
		        rd.forward(request,response);  
		    }  
		  else if(a==2){  
		     
		        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		        rd.include(request,response);  
		  }
		  pw.close();
		
		
	}

}
