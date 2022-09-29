
import jakarta.servlet.http.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Loginpg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  	
		PrintWriter pw=response.getWriter();
		String USERNAME=request.getParameter("t1");
		String PASSWORD=request.getParameter("t2");
		  if(Logindao.validate(USERNAME, PASSWORD)){  
		        RequestDispatcher rd=request.getRequestDispatcher("MainPage.jsp");  
		        rd.forward(request,response);  
		    }  
		    else{  
		        pw.print("Sorry username or password error");  
		        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		        rd.include(request,response);  
		    }  
		pw.close();
		doGet(request, response);;
	}

}
