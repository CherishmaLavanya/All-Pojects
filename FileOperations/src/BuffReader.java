import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader 
{

	public static void main(String[] args) 
	{
       try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
       {
    	   System.out.println("Buffer Reader");
    	   while(br.ready())
    	   {
    		  // System.out.print(br.readLine());
    	   }
		   System.out.print(br.readLine());

       }
       catch(IOException e)
       {
    	   e.printStackTrace();
     
       }
	}

}
