package collectionsExp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseMethod {

	public static void main(String[] args) {
		
		        // Example usage
		        List<Integer> myList = new ArrayList<Integer>();
		        myList.add(1);
		        myList.add(2);
		        myList.add(3);
		        myList.add(4);

		        System.out.println("Original List: " + myList);
		        reverse(myList);
		        System.out.println("Reversed List: " + myList);
		    }

		    // Custom reverse method for collections
		    public static <T> void reverse(List<T> list) {
		        int size = list.size();
		        for (int i = 0; i < size / 2; i++) {
		            T temp = list.get(i);
		            list.set(i, list.get(size - i - 1));
		            list.set(size - i - 1, temp);
		        }
		    }
		

	}


