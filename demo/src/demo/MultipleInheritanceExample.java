package demo;

public class MultipleInheritanceExample {
	MultipleInheritanceExample()
	{
	   System.out.println("base class is working");	
	}
	
	
} 
 class multi extends MultipleInheritanceExample {
	multi()
	{
	   System.out.println("child class is working");	
	}
	
	public static void main(String[] args) {
		multi o = new multi();
		MultipleInheritanceExample p = new 	MultipleInheritanceExample();


	}
	 
} 