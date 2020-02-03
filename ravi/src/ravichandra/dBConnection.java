package ravichandra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class dBConnection 
{
	@Test
	  public void conTest() throws Throwable {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "admin");
		  Statement stat=con.createStatement();
		  String query="select *from students_info";
		  ResultSet result=stat.executeQuery(query);
		  while(result.next()) {
			  System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
}
		  con.close();


		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}}