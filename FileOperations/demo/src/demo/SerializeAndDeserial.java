  package demo;
import java.io.*;
public class SerializeAndDeserial implements Serializable
{
   private String s = "lavanya";
   String name; 
	int age;
	int salary;
	String manager;
	String depart;
	
	
	SerializeAndDeserial()
	{
	System.out.println("hii");	
	}
	SerializeAndDeserial(String name,int age) 

	{
		this.name = name; 
		this.age = age; 
     	//System.out.println(name+" " +age); 

	} 
	SerializeAndDeserial(int salary,String name) 
	{
		this.name = name; 
		this.salary = salary; 
      	// System.out.println(salary+" "+name); 

	} 
	SerializeAndDeserial(String name, int salary,String manager,String depart) 
	{
		this.name = name; 
		this.salary = salary; 
		this.manager = manager; 
		this.depart = depart; 
       	 //System.out.println(name+" "+salary+" "+age+" "+manager+" "+depart); 


	} 
	void setName(String manager)
	{
		this.manager=manager;
	}
	public static void main(String[] args)
	{
		SerializeAndDeserial s1 = new SerializeAndDeserial("lavanya",22);
		
		// s1 = new SerializeAndDeserial("reshmika", 23);
		 try {
			  FileOutputStream fos = new FileOutputStream("lavanya.txt");
		
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(s1);
				
				oos.close();
				
				fos.close();
				
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		 
		 SerializeAndDeserial s2 = null;
			
			//deserialization 
			
			try 
			{
				FileInputStream fis = new FileInputStream("lavanya.txt");
				
				ObjectInputStream ous = new ObjectInputStream(fis);
				
				s2 = (SerializeAndDeserial)ous.readObject();
				
				ous.close();
				
				fis.close();
				
				System.out.println(s2.name+" "+s2.age);
				
				
				
		
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		 
		 
		 

	}
}

