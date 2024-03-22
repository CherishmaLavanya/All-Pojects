package Day6;
import java.util.*;
public class Lavanya_program1 
{
	public static void main(String args[]){   
        System.out.println(ex3Method());  
     }
   static int ex3Method()
   {
     try {    
         int a = 25 / 5;
        return 15;  
     }   
     // handles the Arithmetic Exception / Divide by zero exception  
     catch (ArithmeticException e){  
       System.out.println(e);
       return 98;
     }   
     finally
      {
       return 33;   
      }
     
   }   
}

