package weekend1;

import java.util.*;
import java.util.ArrayList;

public class lavanya_assignment5 {

	static Iterator func(ArrayList mylist)
	   {
	      Iterator it=mylist.iterator();
	      while(it.hasNext())
	      {
	         Object element = it.next();
	         if(element instanceof String) 
	            break;
	      }
	      return it;
	      
	   }

	   public static void main(String []argh)
	   {
	      ArrayList mylist = new ArrayList();
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter Number of Integers before the  ###");
	      int n=s.nextInt();
	      System.out.println("Enter Number of Strings after the ###");
	      int s1=s.nextInt();
	      System.out.println("Enter  Integer number ");
	      for(int i=0;i<n;i++)
	      {
	         mylist.add(s.nextInt());
	      }
	      mylist.add("###");
	      System.out.println("Enter the Strings you need");
	      for(int i=0;i<s1;i++)
	      {
	         mylist.add(s.next());
	      }
	      
	      
	      Iterator it=func(mylist);
	      
	      while(it.hasNext())
	      {
	         Object element = it.next();
	         System.out.println((String)element);
	      }
	      
	   }

}


