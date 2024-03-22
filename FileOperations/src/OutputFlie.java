import java.io.*;

public class OutputFlie {

	public static void main(String[] args) {
     try(OutputStreamWriter os = new OutputStreamWriter(System.out))
     {
    	 os.write("lavanya");
     }
     catch(IOException e)
     {
  	   e.printStackTrace();
   
     }
     
     
     try(FileWriter fw = new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\file.txt",true))
     {
		fw.write("\nthis file writer");
	 } 
     catch (Exception e) 
     {
		// TODO: handle exception
	}
     
	}

}
