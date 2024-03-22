package Day6;
import java.util.*;
	   
public class Assignment1_Exceptionkey 
{
	public void add(int a)
	{
		int b = 10;
		int c = a+b;
        System.out.println(c);

	}
	
     public static void main(String[] args) 
     {
    	 Assignment1_Exceptionkey s1 = new Assignment1_Exceptionkey();
        	 int a;
             Scanner s = new Scanner(System.in);
             System.out.println("enetr the value of a");
             a = s.nextInt();
    	     while(a <= 0)
    	     {
    	      try {
    	    	  int c = a/0; 
    	      }
    	      catch(ArithmeticException e)
    	      {
    	    	  System.out.println(e);
    	      }  
    	     
    	     }
    	      
             if(a > 0)
             {
                 s1.add(a);

             }
            
    	 }
	}

		


