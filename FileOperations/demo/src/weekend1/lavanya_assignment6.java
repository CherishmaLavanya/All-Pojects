package weekend1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lavanya_assignment6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try 
	   {
		
		   try 
		      {	
			   System.out.println("enter the value of a");
                int a = s.nextInt();
			   
 			   System.out.println("enter the value of b");

                int b = s.nextInt();
			   
			   System.out.println(a/b);	
			   
		      }
		   
		      catch(InputMismatchException e)
		     {
			 
			  e.printStackTrace();
			  
		     }
	}
			
		
	 
	catch(Exception e)
	
	{		    
		e.printStackTrace();
		
    }
		

	}

}

