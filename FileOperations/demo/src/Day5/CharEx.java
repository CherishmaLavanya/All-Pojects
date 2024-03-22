package Day5;
import java.util.*;
public class CharEx {

static char c;
	
  public static void main(String[] args) 
  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
        String   s1 = sc.nextLine();
      for( c = 'a';c < 'z';c++)
      {
    	  for( int i =0;i< s1.length();i++)
    	  {
    		  if( s1.charAt(i)==c)
    		  {
    			  System.out.println(""+c);
    			  break;
    		  }
    	  }
      }

		
		 
	}
}
