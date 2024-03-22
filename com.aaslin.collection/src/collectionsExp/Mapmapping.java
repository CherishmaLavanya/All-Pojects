 //Write a Java program to test if a map contains a mapping for the specified value
package collectionsExp;
import java.util.HashMap;
import java.util.Map;

public class Mapmapping {

		    public static void main(String[] args) {
		    	
	        Map<String,Integer> map = new HashMap<>();
	        
	        map.put("apple", 10);
	        map.put("banana", 20);
	        map.put("orange", 30);
	        
	        int valueToTest = 20;
	        boolean containsValue = map.containsValue(valueToTest);

	        if (containsValue) {
	            System.out.println("Map contains a mapping for the value: " + valueToTest);
	        } else {
	            System.out.println("Map does not contain a mapping for the value: " + valueToTest);
	        }
	    }
	}


