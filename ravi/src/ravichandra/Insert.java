package ravichandra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.testng.annotations.Test;
import com.mysql.jdbc.Driver;
public class Insert
{
  Connection con;
	@Test
	public void conTest() throws Throwable 
	{
      try
		{
			Driver dr=new Driver();
			DriverManager.registerDriver(dr);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "admin");
			Statement stat=con.createStatement();
			String query="insert into students_info (regno, firstname, middlename, lastname) values('8', 'abc','xyz', 'efg')";

			int result=stat.executeUpdate(query);
			if(result==1)
			{
				System.out.println("data is inserted");
			}
		}
		catch(Exception e)
		{
			System.out.println("Data not inserted");
		}
		finally
		{
			con.close();
		}

	}



}
