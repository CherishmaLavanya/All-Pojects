package collectionsExp;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethod {

	public static void main(String[] args) {
		 List<Integer> myList = new ArrayList<Integer>();
	        myList.add(1);
	        myList.add(2);
	        myList.add(3);
	        myList.add(4);
          System.out.println(myList);
          myList.removeAll(myList);
          System.out.println(myList);
      
	}

}
