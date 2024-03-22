  
package Files;

import java.io.*;
import java.util.*;

public class Lavanya_FileExample1
{
    public static void main(String[] args) 
    {
    	 Map<String, Integer> FreMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\word_frequencies.txt"))) {
            String l;
            while ((l = br.readLine()) != null) {
                String[] words = l.split(" ");
                for (String word : words) 
                {
                    word = word.toLowerCase(); 
                    FreMap.put(word, FreMap.getOrDefault(word, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(FreMap.entrySet());
            sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                bw.write(entry.getKey() + " " + entry.getValue() + "\n");
            }

        } catch (IOException e) {
            // Handle file IO exceptions
            e.printStackTrace();
        }
    }
}
