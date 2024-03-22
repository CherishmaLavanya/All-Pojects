package weekend1;
import java.util.*;
class lavanya_assingnment9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 number you need");
        for (i = 1; i <= 5; i++)
        {
         arr[i - 1 ] = s.nextInt();
        }
        for (i = 0; i < 5; i++)
          checkPrimeNum(arr[i]);
    }
    
    public static void checkPrimeNum(int n)
     {
        char flag = 'n';
        int i;
       for ( i = 2; i <= n/2 ; i++)
           {
               if(n % i == 0)
                {
                    flag = 'y';
                    break;
                }
           }
            if (flag == 'n')
             System.out.println(n);  
       
     }

}