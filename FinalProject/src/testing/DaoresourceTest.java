package testing;
import bean.Product;
import resource.Daoresource;
import java.sql.Connection;
import java.sql.DriverManager;
import static org.junit.Assert.*;

import java.sql.DriverManager;

import org.junit.Test;

public class DaoresourceTest {

	//@Test
	public void testcloseDbConnection() {
		Product p=new Product();
		Daoresource drs=new Daoresource();
		
	    Connection res=Daoresource.getDBConnection();
	    assertEquals(null,res);
		
	}

}
