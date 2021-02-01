package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import bean.Product;
import dao.Productdao;
import java.util.List;

public class PdaoTest {
	static Productdao pd;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pd=new Productdao();
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

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
	//@Test
		public void testAddproduct() {
			Product p=new Product();
			p.setId(106);
			p.setName("mobile");
			p.setPrice(1700);
			int res=pd.Addproduct(p);
			int msg=1;
			assertEquals(msg,res);
		}

		//@Test
		public void testUpdateproduct() {
			Product p=new Product();
			p.setId(101);
			p.setPrice(1600);
			int res	= pd.Updateproduct(p);
			assertEquals(1, res);
		}

		@Test
		public void testDeleteProduct() {
			Product p=new Product();
			p.setId(102);
			int res=pd.Deleteproduct(p);
			assertEquals(1,res);
		}
		//@Test
		public void testDisplayallproduct() {
			List<Product> listofproduct = pd.Displayallproduct();
			assertEquals(3,listofproduct.size());
		}
}
