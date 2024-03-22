package Day5;
import java.util.*;
public class palEx {
   
    public static void main(String[] args) {
      int i;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
    String  s1= s.nextLine();
 
    int len = s1.length();
     String r ="";
     for(i = len-1; i>=0; i--)
      {
         r= r + s1.charAt(i);
        }
   if(s1.equals(r))
   {
	System.out.println("it is a palindrome");
	
    }

     else 
    {
	System.out.println("it is not a palindrome");
    }
}
}