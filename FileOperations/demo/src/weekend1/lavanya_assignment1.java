package weekend1;

abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
	
}

public class lavanya_assignment1 extends Book {
	
	/*String title ="This title is:";*/
	void setTitle(String s) 
	{
		
				System.out.println("This title is: "+ s);
	}


	public static void main(String[] args) {		
		lavanya_assignment1 bo = new  lavanya_assignment1();
		
		
       //System.out.print(s);
		
		bo.setTitle("Tale of two cities");

	}

}






	

