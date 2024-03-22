 package Day7_Innerclasses;
import java.util.*;
class Outers
{
	int n;
	int calculate(int n)
	{
	class Inner1
	{
	int cub(int n)
	{
	 return n*n*n;	
	}
	}
	Inner1 i = new Inner1();
	return i.cub(n);
	//return n;
 }
}	
public class Lavanya_program4{
	public static void main(String[] args) {
		int n1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enetr the value of n1");
		
		n1 = s.nextInt();
		
		Outers o = new Outers();
		
		int f = o.calculate(n1);
		
		System.out.println(f);
		
	}
}
