package ParacticeFiles;

import java.io.*;

public class MethodCanRead {

	public static void main(String[] args) {
		try(FileReader f = new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\methodread.txt"))
		   {
			   int letter = f.read();
				 while(f.ready())
				 {
					 System.out.print((char)letter);
					 letter = f.read();
				 }
				 System.out.print((char)letter);
		
		   }
		   
		   catch(IOException e)
		   {
			   e.printStackTrace();
		 
		   }
		File f = new File("C:\\Users\\AASLIN-05\\FileOperation\\methodread.txt");
		if(f.canRead())
		{
			System.out.println("can read");
		}
		else
		{
			System.out.println("\n can not read");

		}

	}

}
