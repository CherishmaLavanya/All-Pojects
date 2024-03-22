package Day7_Innerclasses;

 class Outer1
{
	  class Inner
	 {
	       void display()
				{
					System.out.println("testing");

				}
	 }
}


public class Lavanya_program2 {
   
  public static void main(String[] args) {
	  Outer1.Inner oi = new Outer1().new Inner();
	  oi.display();
}
  }
  
