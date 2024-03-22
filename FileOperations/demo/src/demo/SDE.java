package demo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SDE implements Serializable {
	
	
		private String n1="kiran";
		String name;
		String manager;
		String dept;
		int age;
		int salary;
		
		SDE()
		{
			System.out.println("\nThis is a default constructor\n");
			System.out.println("----------------------------------------------");


		}
		
		SDE(String name,int age)
		{
			this.name = name;
			this.age = age;

			/*System.out.println("\nName: "+name);
			System.out.println("Age: "+age+"\n");
			System.out.println("----------------------------------------------");*/
			
		}
		
		SDE(String name,int salary,String dept)
		{
			this.name = name;
			this.salary = salary;
			this.dept = dept;
			
		/*System.out.println("\nName: "+name);
			System.out.println("Salary: "+salary);
			System.out.println("Dept: "+dept+"\n");
			System.out.println("----------------------------------------------");*/
			
		}
		
		SDE(String name,int salary,int age,String manager,String dept)
		{
			this.name = name;
			this.salary= salary;
			this.age = age;
			this.manager = manager;
			this.dept = dept;
		}
		
		void setName(String manager)
		{
			this.manager = manager;	
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//serialization
		SDE s = new SDE("kiranmai",21);
		
		 s = new SDE("rukmini",24,"HR");
		
		
		try {
			  FileOutputStream fos = new FileOutputStream("fresh.txt");
		
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(s);
				
				oos.close();
				
				fos.close();
				
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
SDE s1 = null;
		
		//deserialization 
		
		try 
		{
			FileInputStream fis = new FileInputStream("fresh.txt");
			
			ObjectInputStream ous = new ObjectInputStream(fis);
			
			s1 = (SDE)ous.readObject();
			
			ous.close();
			
			fis.close();
			
			
	
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
		