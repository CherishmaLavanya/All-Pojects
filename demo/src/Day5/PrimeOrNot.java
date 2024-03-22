package Day5;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) 
	{
		int n;
		char flag = 'n';
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a n value");
		n = s.nextInt();
		for(i = 2; i <= n/2; i++)
		{
			if(n%i == 0)
			{
				flag = 'n';
			}
			else 
			{
				flag = 'y';
			}
			
		}
		if(flag == 'y')
		{
			System.out.println("prime");
	    }
		else
		{
			System.out.println("not prime");

		}
	}

}
