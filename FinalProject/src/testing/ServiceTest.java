package testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import service.Productservice;
import bean.Product;
import org.junit.Test;

public class ServiceTest {
	static Productservice ps;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ps=new Productservice();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}
	//@Test
		public void testDisplayallproduct() 
		{
			List<Product> lp = ps.Displayallproduct();
			assertEquals(3,lp.size());
		}

		//@Test
		public void testAddproduct()
		{
			Product p=new Product();
			p.setId(104);
			p.setName("charger");
			p.setPrice(1700);
			String res=ps.Addproduct(p);
			String msg="Recored Added Successfully";
			assertEquals(msg,res);
		}

		//@Test
		public void testUpdateproduct()
		{
			Product p=new Product();
			p.setId(101);
			p.setPrice(1200);
			String res	= ps.Updateproduct(p);
			assertEquals("Product Updated Successfully", res);
		}

		//@Test
		public void testDeleteproduct()
		{
			Product p=new Product();
			p.setId(103);
			String res=ps.DeleteProduct(p);
			assertEquals("Product deleted",res);
		}
		
		//@Test
		public void testDisplayProductBYPriceASC()
		{
			List<Product> listofproduct=ps.DisplayProductBYPriceASC();
			assertEquals(3, listofproduct.size());
			Product p= listofproduct.get(0);
			assertEquals("Earphone", p.getName());
			Product p1= listofproduct.get(1);
			assertEquals("charger", p1.getName());
			Product p2= listofproduct.get(2);
			assertEquals("TV", p2.getName());		
		}
		
		//@Test
		public void testDisplayProductBYPriceDESC()
		{
			List<Product> listofproduct=ps.DisplayProductBYPriceDESC();
			assertEquals(3, listofproduct.size());
			Product p= listofproduct.get(0);
			assertEquals("TV", p.getName());
			Product p1= listofproduct.get(1);
			assertEquals("charger", p1.getName());
			Product p2= listofproduct.get(2);
			assertEquals("Earphone", p2.getName());		
		}
		
		//@Test
		public void testDisplayProductBYNameASC()
		{
			List<Product> listofproduct=ps.DisplayProductBYNameASC();
			assertEquals(3, listofproduct.size());
			Product p= listofproduct.get(0);
			assertEquals("charger", p.getName());
			/*Product p1= listofproduct.get(1);
			assertEquals("Earphone", p1.getPname());
			Product p2= listofproduct.get(2);
			assertEquals("TV", p2.getPname());*/		
		}

	}
