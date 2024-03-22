package Files;

import java.io.*;
import java.util.*;

public class Lavanya_FileExample3 {
	public void reverse() throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\file.txt", true);

		try (FileReader f = new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\input.txt")) {
			List<Character> rev = new ArrayList<>();
			int letter;
			while ((letter = f.read()) != -1) {
				rev.add((char) letter);
			}

			// Print the content in reverse order
			for (int i = rev.size() - 1; i >= 0; i--) {

				fw.write(rev.get(i));

				// System.out.print(rev.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Lavanya_FileExample3 fi = new Lavanya_FileExample3();
		fi.reverse();
	}
}