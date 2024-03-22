package Day6;

public class Lavanya_program3 {
	public static void main(String[] args) {
		System.out.println(main());
}
  //public void fun()
 // {
	  //System.out.println("program using return");
 // }
	public static int main() {

		
         try
         {
        	 int value = 10/0;
        	 return value;

         }
         catch(ArithmeticException e)
         {
        	return -1; 
         }
      /*finally 
 		{
              return 7;

 		}*/
	}
	
	

}