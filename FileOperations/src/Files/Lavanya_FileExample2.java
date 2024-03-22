//Create a Java program that concatenates the contents of two text files, "file1.txt" and "file2.txt", into a new file named "
//concatenated.txt". Make sure to handle file not found exceptions and any other relevant IO exceptions.

package Files;
import java.io.*;
public class Lavanya_FileExample2 {
	public void method1() throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\concatenated.txt",true);
        try(FileReader f = new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\file1.txt"))
	   {
		   int letter = f.read();
			 while(f.ready())
			 {
				 letter = f.read();
				fw.write(letter);
			 }
			fw.close();
             f.close();
	   }
	   
	   catch(IOException e)
	   {
		   e.printStackTrace();
	 
	   }
       

	}
	
	public void method2() throws IOException
	{
     FileWriter fw = new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\concatenated.txt",true);

	try(FileReader f = new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\file2.txt"))
	   {
		   int letter = f.read();
			 while(f.ready())
			 {
				 letter = f.read();
					fw.write(letter);

			 }
			 //fw.close();
             //f.close();

	   }
	   catch(IOException e1)
	   {
		   e1.printStackTrace();
	 
	   }
	
	}
	
		public static void main(String[] args) throws IOException {
		Lavanya_FileExample2 ope = new Lavanya_FileExample2();
		ope. method1();
		ope.method2();

	}

}

