package main;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Scanner;
import service.*;

import bean.Pproduct;
public class Pproductmain {
public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException,Exception {

		Scanner sc=new Scanner(System.in);
		
		int ch,size;
		int id1;
		String name1=null ;
		int price1;
		int n;
		boolean flag=true;
		System.out.println("Enter the number of products you have");
		size=sc.nextInt();

		Pproductservice productm=new Pproductservice();
		ArrayList<Pproduct >p=new ArrayList<Pproduct>();
		    do
			{
				System.out.println("Enter your option:");
				System.out.println("1> Add");
				System.out.println("2> update");
				System.out.println("3> delete");
				System.out.println("4> display");
				System.out.println("5> retrive");
				ch=sc.nextInt();
			switch (ch)
			{  
			case 1:
				System.out.println("1> Add");
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the pid's");
					id1=sc.nextInt();
					System.out.println("Enter the pname");
					sc.nextLine();
					name1=sc.nextLine();
					System.out.println("Enter the price");
					price1=sc.nextInt();
					productm.addPproduct(id1, name1, price1);
					
					System.out.println();
					}
				
				break;
			case 2:
				System.out.println("2> update");
				System.out.println("Enter the pid");
				sc.nextLine();
				id1=sc.nextInt();
				System.out.println("Enter the price");
				price1=sc.nextInt();
				productm.update(id1,name1,price1);
				System.out.println();
				break;
			case 3:
				System.out.println("3> delete");
				System.out.println("Enter the pid's");
				id1=sc.nextInt();
				productm.delete(id1);
				System.out.println(" The pid'sdeleted" +id1);
				
				break;
			case 4:
				System.out.println("4> display");
		        p=productm.display();
		        try
		        {
		        	FileInputStream fis=new FileInputStream("E:\\Program Files\\Sprint 2\\Sfinal.txt");
		        	ObjectInputStream ois=new ObjectInputStream(fis);
		        	Object o=ois.readObject();
		        	Pproduct pp=(Pproduct)o;
		        	for(Pproduct a:p)
					{
					
					System.out.println("id and Name and price "     +a);
				
					}
		        	System.out.println("Deserial ");
		        	ois.close();
		        	fis.close();
		        }catch(Exception e)
		        {
		        	System.err.println(e.toString());
		        	
		        }
		        
				     
				break;
			case  5:
				
				System.out.println("5> retrive");
				System.out.println("Enter the pid's");
				id1=sc.nextInt();
				int temp=productm.retrive(id1);
				System.out.println(" The price's"+temp);
				break;
		   
		   default:
			   System.out.println("Invalid  option:");
			   break;
			   
			}
		
	

			}while(flag);

 


	}
}

