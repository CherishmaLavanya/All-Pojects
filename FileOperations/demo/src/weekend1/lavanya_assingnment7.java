package weekend1;
import java.util.*;

public class lavanya_assingnment7 {
	
	void  Longpower(int x,int y) throws Exception
	{
		if(x>0 && y>0) {
			
			int po = (int) Math.pow(x,y);
			
			System.out.println(po);
			
			}
			
			else if(x==0 || y==0)
			{
				throw new Exception("x and y should not be zero");
			}
			
			else
			{
				throw new Exception("n and p should not be negative");
			}
			
		
		
	}

	public static void main(String[] args) throws Exception {
		
		 lavanya_assingnment7 s1 = new lavanya_assingnment7();
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of x");
		int x = s.nextInt();

		System.out.println("enter value of y");
		
		int y = s.nextInt();
		
		 s1.Longpower(x,y);
		
		

	}

}




