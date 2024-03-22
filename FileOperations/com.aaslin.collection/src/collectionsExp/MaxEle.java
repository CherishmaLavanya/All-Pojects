package collectionsExp;

import java.util.ArrayList;
import java.util.Collections;

public class MaxEle {
	    public static void main(String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        
	        arrayList.add(10);
	        arrayList.add(5);
	        arrayList.add(20);
	        arrayList.add(15);
	        arrayList.add(25);
	        
	        int maxElement = Collections.max(arrayList);
	        System.out.println("Maximum element in the ArrayList: " + maxElement);
	    }
	}

