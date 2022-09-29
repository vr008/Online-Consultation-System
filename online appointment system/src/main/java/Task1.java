
import jakarta.servlet.http.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  	
		PrintWriter pw=response.getWriter();
		int a=Integer.parseInt(request.getParameter("cars"));
		  if(a==1){  
		        RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");  
		        rd.forward(request,response);  
		    }  
		  else if(a==2){  
		     
		        RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");  
		        rd.include(request,response);  
		  }
		  else if(a==3){  
			     
		        RequestDispatcher rd=request.getRequestDispatcher("modify date and time.jsp");  
		        rd.include(request,response);  
		  }
		  pw.close();
		doGet(request, response);
	}

}
