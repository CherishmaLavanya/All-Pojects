package Day4;

class exe {
	String name = "lavanya";
}
class RuntimeExample extends exe
{
     String name= "lavanya";	
     void display()
     {
    	 System.out.println(name);
    	 System.out.println(super.name);
     }
     
}
 class RuntimeExample1 extends RuntimeExample 
 {
  public static void main(String[] args) 
    {
    	RuntimeExample1 r = new RuntimeExample1();
    	r.display();
	}
  
    }

