import java.io.*;
public class BuffWrrite {

	public static void main(String[] args) {
    try(BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\file.txt",true)))
    {
	 br.write("\nBuffer Writer");
   }  
   catch (Exception e) {
}
	}

}
