package demo;
import java.lang.reflect.*;
public class ExampleClone implements Cloneable 
{
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	private String s = "lavanya";
	    String name; 
		int age;
		int salary;
		String manager;
		private static String depart;
		
		
		ExampleClone()
		{
		System.out.println("hii");	
		}
		ExampleClone(String name,int age) 

		{
			this.name = name; 
			this.age = age; 
	     	 System.out.println(name+" " +age); 

		} 
		ExampleClone(int salary,String name,int age) 
		{
			this.name = name; 
			this.salary = salary;
			this.age = age;
	      	 System.out.println(salary+" "+name+" "+age); 

		} 
		ExampleClone(String name, int salary,String manager,String depart,int age) 
		{
			this.name = name; 
			this.salary = salary; 
			this.manager = manager; 
			this.depart = depart; 
			this.age = age;
	       	 System.out.println(name+" "+salary+" "+age+" "+manager+" "+depart); 


		} 
		void setName(String manager)
		{
			this.manager=manager;
			System.out.println(manager);
		}
		public static void main(String[] args) {
			try {
			
			Constructor <ExampleClone> o = ExampleClone.class.getDeclaredConstructor();
			
			ExampleClone obj = o.newInstance();
			
			obj = new ExampleClone("lavanya",22);
			
			 obj = new ExampleClone(20000,"reshmika",21); 
			
			 ExampleClone o1= new ExampleClone("lavanya",20000,"reshmika","HR",21); 
			
	       //	 System.out.println(o1.name+" "+o1.salary+" "+o1.age+" "+o1.manager+" "+o1.depart+o1.age); 

			
			
			ExampleClone obj2 = (ExampleClone)obj.clone();   //cloning
			
			System.out.println(obj2.s);
			
			obj2.setName("pramod");
			
			obj2 = new ExampleClone("priya",16000,"reshmika","HR",21); 
			
			
			}	
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
}
}
