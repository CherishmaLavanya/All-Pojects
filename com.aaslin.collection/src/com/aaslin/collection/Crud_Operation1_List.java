package com.aaslin.collection;
import java.util.*;
public class Crud_Operation1_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> student_id = new ArrayList<Integer>();
   student_id.add(1);
   student_id.add(2);
   student_id.add(3);                                      
   student_id.add(4);
   //System.out.println(student_id);
                                                            //adding elements to list we us add()
   List<String> student_name= new ArrayList<String>();
   student_name.add("lavanya");
   student_name.add("resh");
   student_name.add("priya");
   student_name.add("anju");
  // System.out.println(student_name);
   

   //read single element   
        System.out.println(student_id.get(1));
   
   //to update value
         student_id.set(2,5); 
         System.out.println(student_id);
                                                            //to update the elements in list we use set()
   //to update string
         student_name.set(3,"bhoomi"); 
    //System.out.println(student_name.get(3));
         System.out.println(student_name);
     
   // delete value
         student_id.remove(2);
         System.out.println(student_id);

   // delete string 
     student_name.remove(2);
      System.out.println(student_name);

   

	}

}
