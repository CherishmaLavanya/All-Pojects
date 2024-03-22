package com.aaslin.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Crud_operation_map {

	public static void main(String[] args) {
        Map<Integer, String> Student = new HashMap<>(); 
         Student.put(1,"lavanya");
         Student.put(2,"resh");         
         Student.put(3,"priya");
        // System.out.println(Student);
         
         
   // System.out.println(Student.keySet());
    
//     for(Entry<Integer, String> key :Student.entrySet())
//    {
//    	System.out.println(key);
    
//    }
    Student.put(2, "likki");
	 System.out.println(Student);

     Student.remove(new Integer(2)); 
 	 System.out.println(Student);

    }

}
