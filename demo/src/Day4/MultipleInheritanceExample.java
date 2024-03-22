package Day4;

interface MultipleInheritanceExample1  
{
	void display();

}
interface inter3
{
	void printable();
}
public class MultipleInheritanceExample implements MultipleInheritanceExample1,inter3
{
	public void display() 
	{
		System.out.println("hello");
	}
	public void printable() 
	{
		System.out.println("heeeee");
	}
	public static void main(String args[])
	{
		MultipleInheritanceExample e = new MultipleInheritanceExample();
		e.display();
		e.printable();
		
	}
}