import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*; 
import jakarta.servlet.http.*;

public class Logindao {
	public static boolean validate(String USERNAME, String PASSWORD) {
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from login where uname=? and PASSWORD=?");  
		ps.setString(1,USERNAME);  
		ps.setString(2,PASSWORD);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}
}
