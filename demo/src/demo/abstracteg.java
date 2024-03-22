package demo;
abstract class A1
{
	abstract void show();
	abstract void display();
}

public class abstracteg extends A1 {
	public void show()
	{
		System.out.println("This is show method");
	}
	public static void main(String []args)
	{
		abstracteg ob=new abstracteg();
		ob.show();
		try {
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
