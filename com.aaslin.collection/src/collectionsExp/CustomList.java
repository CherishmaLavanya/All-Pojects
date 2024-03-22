package collectionsExp;

import java.util.ArrayList;
/**
 * 
 * @author lavanya
 * this is a custom List to append
 *
 */

public class CustomList {

	public static  void main(String[] args) {
        ArrayList<String> customList = new ArrayList<String>()
        		{
        	      public boolean add(String value) {
        	    	 return super.add(value+"Modi"); //for the which you have give the string "Modi" will be appended
        	      }
        		};
        		customList.add("hi");
        		System.out.println(customList);
	}

}
