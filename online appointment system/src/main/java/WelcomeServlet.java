
import jakarta.servlet.http.*;

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


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("name");
		String b=request.getParameter("phone");
		String c=request.getParameter("age");
		String d=request.getParameter("timeslot");
		String e1=request.getParameter("problem");
		String f=request.getParameter("date");
		
		String k=a+b+c+d;
			  
			
			
			try{  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
				Statement statement=connection.createStatement();
				int executeUpdate=statement.executeUpdate("insert into appointment values(+'"+k+"',+'"+a+"',+'"+b+"',+'"+c+"',+'"+d+"',+'"+e1+"',+'"+f+"')");
			
				connection.close();
			
				PrintWriter out=response.getWriter();
				out.println("Appointment is Confirmed");
				out.print("Appointment Id  ");
				out.println(k);
				out.print("Name             ");
				out.println(a);
				out.print("Phone            ");
				out.println(b);
				out.print("Age               ");
				out.println(c);
				out.print("Time Slot          ");
				out.println(d);
				out.print("Date          ");
				out.println(f);
				
		        
		      
	}
			catch(Exception e){
				System.out.println(e);} 
			}

	

}
