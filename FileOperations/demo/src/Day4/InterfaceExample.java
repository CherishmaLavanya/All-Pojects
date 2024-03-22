package Day4;
interface inter1 
{
	void display();

}
interface inter2
{
	void display();
}
public class InterfaceExample implements inter1,inter2
{
	public void display() 
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		InterfaceExample i = new InterfaceExample();
		inter1 a1 = new InterfaceExample();
		a1.display();
		inter1 a2 = new InterfaceExample();
		a2.display();
		
	}
	
}