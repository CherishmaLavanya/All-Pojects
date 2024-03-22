package Day7_Innerclasses;
import java.util.*;
interface Outer
{
	interface Inner
	{
		void mathfun();
	}
}

public class Lavanya_program3 {
  static Outer.Inner inner = new Outer.Inner()
	{
	  public void mathfun()	
	  {
		   int num1,num2;
		   Scanner s = new Scanner(System.in);
		   System.out.println("enter the value of num1");
		   num1 = s.nextInt();
		   System.out.println("enter the value of num2");
		   num2 = s.nextInt();
		   //addition, subtraction, multiplication, or division
		   int add=0;
		   int  sub =0;
		   int mul =0;
		   int div =0;
		   add = num1 + num2;
		   System.out.println(add);
		   sub = num1 - num2;
		   System.out.println(sub);
		   mul = num1 * num2;
		   System.out.println(mul);
		   div = num1/num2;
		   System.out.println(div);


	  }

 
	};
	public static void main(String arg[])
	{
	inner.mathfun();	
	}
	
   
}

