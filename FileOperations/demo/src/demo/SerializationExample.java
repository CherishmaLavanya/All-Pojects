package demo;
import java.io.*;    
public class SerializationExample {

	public static void main(String[] args) {
	try
	{
     Student s = new Student(11,"ram");
     FileOutputStream fout = new FileOutputStream("f.txt");    
     ObjectOutputStream out=new ObjectOutputStream(fout);    
     out.writeObject(s);    
     out.close();   
     System.out.println("success");    
     }
	catch(Exception e)
	{
    	 
    	 System.out.println(e);
    	 }    
    }    
      
	
	

}
