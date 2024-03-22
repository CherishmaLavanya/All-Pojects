package demo;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		try 
		{
			int num = 25/0;
			System.out.println(num);
	  		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);

		}
		finally
		{
			
			System.out.println("finnally block is always executed");

		}

	}

}
