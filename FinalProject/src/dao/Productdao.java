package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import bean.Product;
import resource.Daoresource ;

public class Productdao {
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con=Daoresource .getDBConnection();
public int Addproduct(Product pp)
	{
		Product p=new Product();
		
		try
		{
	        pstmt=con.prepareStatement("insert into product values(?,?,?,?)");
			pstmt.setInt(1, p.getId());
			pstmt.setString(2, p.getName());
			pstmt.setFloat(3, p.getPrice());
			pstmt.setDate(4, null);
			int res1=pstmt.executeUpdate();	
			return p.getId();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return 0;
	}
	public int Updateproduct(Product pp)
	{
		try
		{
			
			pstmt=con.prepareStatement("Update product set price=? where id=?");
			pstmt.setInt(1, pp.getPrice());
			pstmt.setInt(2, pp.getId());
			int res1=pstmt.executeUpdate();
			return res1;
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return 0;
	}
	public int Deleteproduct(Product pp)
	{
		
		try
		{
			pstmt=con.prepareStatement("delete from product where id=?");
			pstmt.setInt(1, pp.getId());
			int res1=pstmt.executeUpdate();
			return res1;
		}
		catch(Exception e)
		{
			System.err.println(e);
			
		}
		return 0;
	}
	public List<Product> Displayallproduct()
	{
		List<Product> lp=new ArrayList<>();
		try
		{
	
			 pstmt = con.prepareStatement("select * from product");
			 rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setStore_date(rs.getString(4));
				lp.add(p);
				
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
			
			
		}
		return lp;
	}
	
	public List<Product> DisplayallproductAsc()
	{
		List<Product> lp=new ArrayList<>();
		try
		{
			 pstmt = con.prepareStatement("select * from product order by price ASC");
			 rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setStore_date(rs.getString(4));
				lp.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return lp;
	}
	
	public List<Product> DisplayallproductNameAsc()
	{
		List<Product> lp=new ArrayList<>();
		try
		{
		    pstmt = con.prepareStatement("select * from product order by name ASC");
			 rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setStore_date(rs.getString(4));
				lp.add(p);
				
			}
		}
		catch(Exception e)
		{
			
		}
		return lp;
	}
	public List<Product> DisplayallproductNameDesc()
	{
		List<Product> lp=new ArrayList<>();
		try
		{
		 pstmt = con.prepareStatement("select * from product order by name DESC");
	      rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setStore_date(rs.getString(4));
				lp.add(p);
				
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
			
		}
		return lp;
	}
	public List<Product> DisplayallproductDesc()
	{
		List<Product> lp=new ArrayList<>();
		try
		{
			 pstmt = con.prepareStatement("select * from product order by price DESC");
			 rs = pstmt.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setStore_date(rs.getString(4));
				lp.add(p);
				
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
			
		}
		return lp;
	}
}
