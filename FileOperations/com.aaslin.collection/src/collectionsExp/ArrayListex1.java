//1. Write a Java program to create a new array list, add some elements (string) and print out the collection

package collectionsExp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class ArrayListex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> student= new ArrayList<String>();
		   student.add("lavanya");
		   student.add("resh");
		   student.add("priya");
		   student.add("anju");
		   student.add("lavanya");

		   for(String i : student)
			   System.out.println(i + " ");
		   
//2. a) Write a Java program to insert an element into the array list at the first position		   
		   student.set(0, "sreya");
		   System.out.println(student);

//b) Write a Java program to remove the fifth element from a array list
		   student.remove("lavanya");
		   System.out.println(student);
		   
// c) Write a Java program to retrieve an element (at a specified index) from a given array list
		   student.get(1);
		   System.out.println(student);

 //3.a) Write a Java program to reverse elements in a array list
		   Collections.reverse(student);
		   System.out.println(student);
//b) Write a Java program to search an element in a array list

		   Scanner s = new Scanner(System.in);
	        System.out.print("Enter the element to search: ");
	        String elementToSearch = s.nextLine();
	        char flag = 'n';
	        for(String element : student )
	        {
	           if(element.contentEquals(elementToSearch))	
	           {
	        	   flag = 'y';
	        	   break;
	           }
	        }
	        
	        if (flag == 'y') 
	        {
	            System.out.println("Element found in the ArrayList."+ elementToSearch);
	        } 
	        else 
	        {
	            System.out.println("Element not found in the ArrayList.");
	        }
	        
//4. Write a Java program how to Convert a ArrayList to HashSet

	        
	        HashSet<String> hashSet = new HashSet<>(student);
	        System.out.println("HashSet: " + hashSet);

	        
	    }

		   
	}


