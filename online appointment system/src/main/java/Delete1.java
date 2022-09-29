

import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Delete1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static boolean validate(String ano) {
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from appointment where ano=?");  
		ps.setString(1,ano);  
	;  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		
	

}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
				String a=request.getParameter("eno");
				
				try{  
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
					Statement statement=connection.createStatement();
					ResultSet rs = statement.executeQuery("select ano from appointment");
					int l=0;
					PrintWriter out=response.getWriter();
				
						
					
					if(validate(a)) {
					out.println("appointment cancelled");
					PreparedStatement ps=connection.prepareStatement("delete from appointment where ano=?");
					ps.setString(1,a); 
					ps.executeUpdate();
					
					}
					else {
					out.println("enter valid appointment id");
					}
					
					
					
					connection.close();
		             } 
				catch(Exception e){
					System.out.println(e);} 
				}
		
	

}
