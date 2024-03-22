package Files;

import java.util.*;
import java.io.*;

public class TreasureHunter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Specify the path to the file
		String filePath = "C:\\Users\\AASLIN-05\\FileOperation\\treasure_map.txt";

		// Read treasure coordinates from file
		ArrayList<int[]> treasures = readTreasuresFromFile(filePath);

		while (true) {
			System.out.print("Enter your current X coordinate: ");
			int X = scanner.nextInt();
			System.out.print("Enter your current Y coordinate: ");
			int Y = scanner.nextInt();

			// Calculate distances and store them in a TreeMap for sorting
			TreeMap<Double, int[]> distanceMap = new TreeMap<>();
			for (int[] treasure : treasures) {
				int treasureX = treasure[0];
				int treasureY = treasure[1];
				double distance = Math.sqrt(Math.pow(X - treasureX, 2) + Math.pow(Y - treasureY, 2));
				distanceMap.put(distance, treasure);
			}

			// Display treasures sorted by distance
			System.out.println("Treasures sorted by distance:");
			for (Map.Entry<Double, int[]> entry : distanceMap.entrySet()) {
				double distance = entry.getKey();
				int[] treasure = entry.getValue();
				System.out.println("Treasure at (" + treasure[0] + ", " + treasure[1] + ")  Distance: " + distance);
			}
			break;
		}
        scanner.close();

	}

	// Function to read treasure coordinates from file
	public static ArrayList<int[]> readTreasuresFromFile(String filePath) {
		ArrayList<int[]> treasures = new ArrayList<>();
		Scanner fileScanner = new Scanner(System.in);
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			String[] coordinates = line.split(" ");
			int x = Integer.parseInt(coordinates[0]);
			int y = Integer.parseInt(coordinates[1]);
			treasures.add(new int[] { x, y });
		}
		fileScanner.close();
		return treasures;
	}
}
