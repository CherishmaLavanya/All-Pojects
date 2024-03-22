package com.aaslin.collection;

import java.util.ArrayList;
import java.util.List;

public class Crud_Operation2_Arraylist {

	public static void main(String[] args) {
		 ArrayList<Integer> student_id = new ArrayList<Integer>();
		  student_id.add(1);
		   student_id.add(2);
		   student_id.add(3);                                      
		   student_id.add(4);
		  // System.out.println(student_id);
		   for(Integer i : student_id)
			   System.out.println(i + " ");

	ArrayList<String> student_name = new ArrayList<String>();
	 student_name.add("lavanya");
	   student_name.add("resh");
	   student_name.add("priya");
	   student_name.add("anju");
	   //System.out.println(student_name);
         for (String i : student_name )
	     System.out.println(i + " ");

//	    for (int i = 0 ; i < 2 ; i++)
//	    {
//	    	System.out.println(student_name.get(i));
//	    }
	    //update
         student_id.set(2,5);
         System.out.println(student_id);
         student_name.set(2,"bhoomi");
         System.out.println(student_name);
	    
         //delete
         student_id.remove(2);
         System.out.println(student_id);
         student_name.remove(2);
         System.out.println(student_name);
	    
	}
}
