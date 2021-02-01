package service;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectOutputStream;
import bean.Pproduct;

public class Pproductservice implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 6733332716162367001L;
	ArrayList<Pproduct>pp=new ArrayList<Pproduct>();
	FileOutputStream fos;
	ObjectOutputStream oos;
	Pproduct pat;
	public int addPproduct(int id,String name,int price)throws IOException{
	
		try
		{
		pat=new Pproduct(id,name,price);
		pp.add(pat);
		fos=new FileOutputStream("E:\\Program Files\\Sprint 2\\Sfinal.txt");
		oos=new ObjectOutputStream(fos);
		} catch(Exception e)
		{
			System.err.println(e.toString());
		}
				
		return 0;
		
	}
	public int update(int id,String name,int price)throws IOException{
		
		try
		{
		for(Pproduct pat:pp)
		{
			if(id==pat.getId())
			{
				pat.setPrice(price);
				fos=new FileOutputStream("E:\\Program Files\\Sprint 2\\Sfinal.txt",true);
				oos=new ObjectOutputStream(fos);
				oos.writeObject(pat);
			}
		}
		
		}catch(Exception e)
		{
			System.err.println(e.toString());
		}
				
		return 0;
		
	}
	public ArrayList<Pproduct> display()
	{
		return pp ;
	}

public void delete(int id)throws IOException{
		
		
		for(Pproduct pat:pp)
		{
			if(id==pat.getId())
			{
				int a=pp.indexOf(pat);
				pp.remove(a);
				fos=new FileOutputStream("E:\\Program Files\\Sprint 2\\Sfinal.txt");
				oos=new ObjectOutputStream(fos);
				oos.writeObject(pat);
				oos.close();
				
			fos.close();
		
			
			}
		}
		
	}
public int retrive(int id)
{
	for(Pproduct pat:pp)
	{
		if(id==pat.getId())
		{
			return pat.getId();
		}
}
	return 0;
	
}


}
