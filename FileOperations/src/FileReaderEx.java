import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
   try(InputStreamReader is = new InputStreamReader(System.in))
   {
	 int letter = is.read();
	 while(is.ready())
	 {
		 System.out.println((char)letter);
		 letter = is.read();
	 }
	 //is.close();
    
   }
   catch(IOException io)
   {
	   io.printStackTrace();
   }
	

   try(FileReader f = new FileReader("C:\\Users\\AASLIN-05\\FileOperation\\file.txt"))
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
}
}

