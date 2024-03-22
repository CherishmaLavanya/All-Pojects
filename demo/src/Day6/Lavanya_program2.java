package Day6;
import java.util.Scanner;

class Lavanya_program2 extends RuntimeException {
    public Lavanya_program2(String message) {
        super(message);
    }
}

class custom {
    static void checkValue(int value) throws Lavanya_program2 {    
       if(value <= 0) {  
            throw new Lavanya_program2("only positive numbers");    
       } else {   
            System.out.println("value is valid: " + value);   
       }   
    }    

    public static void main(String args[]) {  
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value to check:");
        int value = s.nextInt();
        try { 
            checkValue(value);
        } catch (Lavanya_program2 e) {  
            System.out.println("excetion chatch");  
            System.out.println("Exception  " + e);  
        }  
    } 
}