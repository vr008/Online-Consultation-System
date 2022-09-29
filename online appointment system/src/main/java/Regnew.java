
import jakarta.servlet.http.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Regnew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  	
		PrintWriter pw=response.getWriter();
		String a=request.getParameter("name");
		String b=request.getParameter("password");
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
			Statement statement=connection.createStatement();
			int executeUpdate=statement.executeUpdate("insert into login values(+'"+a+"',+'"+b+"')");
		
			connection.close();
			
			 RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			
	        rd.forward(request,response);
	        
	      
}
		catch(Exception e){
			System.out.println(e);} 
		}

		
	}


