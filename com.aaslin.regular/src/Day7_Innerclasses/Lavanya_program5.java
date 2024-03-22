package Day7_Innerclasses;
import java.util.*;
public class Lavanya_program5 {

	static class InnerFactorialCalculator {
        
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
    
    public static void main(String[] args) {
       
    	//int num = 5;
    	int num;

    	Scanner s =new  Scanner(System.in);
      	num = s.nextInt();
          int k = InnerFactorialCalculator.factorial(num);
        System.out.println("Factorial of " + num + " is: " + k);
    }
}