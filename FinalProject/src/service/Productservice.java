package service;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import  dao .Productdao;
import bean.Product;

public class Productservice {
	Productdao pd;
	List<Product>lp;
	List<Product>lp1;
	public Productservice() {
		  pd=new Productdao();
	                        }
	public List<Product> Displayallproduct()
	{
		lp=pd.Displayallproduct();
		//return pd.Displayallproduct().stream().collect(Collectors.toList());
		return lp;
	}
	
	public String Addproduct(Product pp)
	{
		if(pp.getPrice()<0)
		{
			return "Price must be +ve";
		}
		else if(pp.getPrice()>0 && pp.getPrice()<500)
		{
			return "Price must be greater then 500";
		}
		else if(pd.Addproduct(pp)>0)
		{
			return "Recored Added Successfully";
		}
		else
		{
			return "Record didnt added";
		}
		
	}
	public String Updateproduct(Product pp)
	{
		
		if(pd.Updateproduct(pp)>0)
		{
			return "Product Updated Successfully";
		}
		else 
		{
			return "Product not Available";
		}
		
	}
	public String DeleteProduct(Product pp)
	{
		if(pd.Deleteproduct(pp)>0)
		{
			return "Product deleted";
		}
		else
		{
			return "Id not found";
		}
		
	}
	
	public List<Product> DisplayProductBYPriceASC()
	{
		Comparator<Product> SortPriceASC=(Product p1,Product p2)->(int)(p1.getPrice()-p2.getPrice());
		return (List<Product>)lp1.stream().sorted(SortPriceASC).collect(Collectors.toList());
	}
	
	public List<Product> DisplayProductBYPriceDESC()
	{
		Comparator<Product> SortPriceDESC=(Product p1,Product p2)->(int)(p1.getPrice()-p2.getPrice());
		return (List<Product>) lp1.stream().sorted(SortPriceDESC.reversed()).collect(Collectors.toList());
	}
	
	public List<Product> DisplayProductBYNameASC()
	{
		Comparator<Product> SortNameASC=(Product p1,Product p2)->p1.getName().compareTo(p2.getName());
		return (List<Product>)lp1.stream().sorted(SortNameASC).collect(Collectors.toList());
	}
	


    
	}




