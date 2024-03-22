package Day6;
import java.util.*;
public class Lavanya_program5 {

	public static void main(String[] args) {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = s.nextInt();
        System.out.println("enter the value of b");
        b = s.nextInt();
        try {
        	int div =a/b;
            System.out.println(div);

        	}
        catch(ArithmeticException e)
        {
            System.out.println(e);

        }
      if(a <=1 || b <=1) 
      {
    	  a = 10;
    	  b = 5;
    	 int action = a/b;
         System.out.println(action);

      }
      
	}
}


