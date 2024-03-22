package com.aaslin.collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Crud_operation_Linkehashset {
	public static void main(String[] args) {
		/*Set<Integer>  num = new HashSet<Integer>();
		num.add(56);
		num.add(17);
		num.add(100);
		num.add(11);
		num.add(1);
		num.add(56);

	       //read
		System.out.println(num);
//	       for(Integer i : num)
//			   System.out.println(i + " ");*/
        Set<Integer> num = new LinkedHashSet<Integer>(); 
        num.add(11);
		num.add(6);
		num.add(100);
		num.add(2);
		num.add(1);
	       //read
		System.out.println(num);
		
	}
	
	}


