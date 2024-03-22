package demo;

import java.lang.reflect.*;


public class ConstructorInstanceEx {

		public  String name; 
		public  int age; 
		public  int salary; 
		public  String manager; 
		public  String depart; 
		
		ConstructorInstanceEx() 
		{
			System.out.println("process"); 

		} 

		ConstructorInstanceEx(String name,int age) 
		{
			this.name = name; 
			this.age = age; 
	     	 System.out.println(name+" " +age); 

		} 
		ConstructorInstanceEx(int salary,String name) 
		{
			this.name = name; 
			this.salary = salary; 
	      	 System.out.println(salary+" "+name); 

		} 
		ConstructorInstanceEx(String name, int salary,String manager,String depart) 
		{
			this.name = name; 
			this.salary = salary; 
			this.manager = manager; 
			this.depart = depart; 
	       	 System.out.println(name+" "+salary+" "+age+" "+manager+" "+depart); 


		} 
		
		public static void main(String[] args)
		{try {
			 Constructor<ConstructorInstanceEx> c = ConstructorInstanceEx.class.getDeclaredConstructor(); //all constructors in the class
			 
			 ConstructorInstanceEx r = c. newInstance();
			 
			 //System.out.println(r.name+" " +r.age);
			 
			 r= new ConstructorInstanceEx("lavanya",22);
			 r = new ConstructorInstanceEx(20000,"lavanya");
			 r = new ConstructorInstanceEx("lavanya",20000,"reshmika","IT");
	       	 System.out.println(r); 



			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		} 
}
	


			 



			 
		

