package Files;
import java.util.*;
import java.io.*;

public class Hunter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
        // Read treasure coordinates from file
        ArrayList<int[]> treasures = readTreasuresFromFile("C:\\Users\\AASLIN-05\\FileOperation\\hunter_map.txt");
         System.out.println(treasures);
        // Main loop
        while (true) {
            System.out.print("Enter your current X coordinate: ");
            int currentX = scanner.nextInt();
            System.out.print("Enter your current Y coordinate: ");
            int currentY = scanner.nextInt();
            
            // Calculate distances and store them in a TreeMap for sorting
            TreeMap<Double, int[]> distanceMap = new TreeMap<>();
            for (int[] treasure : treasures) {
                int treasureX = treasure[0];
                int treasureY = treasure[1];
                double distance = Math.sqrt(Math.pow(currentX - treasureX, 2) + Math.pow(currentY - treasureY, 2));
                distanceMap.put(distance, treasure);
            }
            
            // Display treasures sorted by distance
            System.out.println("Treasures sorted by distance:");
            for (Map.Entry<Double, int[]> entry : distanceMap.entrySet()) {
                double distance = entry.getKey();
                int[] treasure = entry.getValue();
                System.out.println("Treasure at (" + treasure[0] + ", " + treasure[1] + ") - Distance: " + distance);
            }
            
            // Ask user if they want to continue
            System.out.print("Do you want to continue searching for more treasures? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Exit");
                break;

            }
            //break;

        }
        scanner.close();

   }
    
    // Function to read treasure coordinates from file
    public static ArrayList<int[]> readTreasuresFromFile(String fileName) {
        ArrayList<int[]> treasures = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(new File("C:\\Users\\AASLIN-05\\FileOperation\\hunter_map.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] coordinates = line.split(" ");
                int x = Integer.parseInt(coordinates[0]);
                int y = Integer.parseInt(coordinates[1]);
                treasures.add(new int[]{x, y});
            }
            fileScanner.close();
        } 
        catch (FileNotFoundException e) 
        {
        }
        return treasures;

	}

}
