package demo;

public class Exampleconstructs {
	Exampleconstructs ()
	{
		System.out.println("hi");
	}
	
	Exampleconstructs (int a,int b)
	{
		System.out.println("hjgf");
	}
}
class exe1 extends Exampleconstructs
{
	public static void main(String[] args) {
		{
			Exampleconstructs o = new Exampleconstructs();
		}
	}
 
}
