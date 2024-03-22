//6. Write a Java program to get keys from a HashMap collection

package collectionsExp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeysHashMap {

	public static void main(String[] args) {
			        // Create a HashMap
		        Map<String, Integer> hashMap = new HashMap<>();

		        // Add some key-value pairs to the HashMap
		        hashMap.put("apple", 10);
		        hashMap.put("banana", 20);
		        hashMap.put("orange", 30);
		        hashMap.put("grape", 40);

		        // Get the set of keys from the HashMap
		        Set<String> keys = hashMap.keySet();

		        // Print the keys
		        System.out.println("Keys in the HashMap:");
		        for (String key : keys) {
		            System.out.println(key);
		        }
		    }
		
	

}
