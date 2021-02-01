package resource;
import java.sql.Connection;
import java.sql.DriverManager;

public class Daoresource {
	
	static Connection con;
	public static Connection getDBConnection() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				
				
		}catch (Exception e) 
		{
			System.err.println("Driver or Connection related error"+e);
			
		}
		return con;
		}
	public void closeDbConnection()
	{
      try
      {
    	  con.close();
      }catch (Exception e)
      {
    	  //Handle exception
      }
	}

}
