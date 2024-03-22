package weekend1;

import java.util.Scanner;

class Soccer{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

public class lavanya_assingnment3 extends Soccer{
	
	 String getName(){
	        return "Soccer Class";
	    }
	 
	 void getNumberOfTeamMembers(){
		 int n = 11 ;
	     System.out.print("Each team has "+ n +" players in " + getName());
	    } 
	 
	/* void getNumberOfTeamMembers(){
		 int n ;
		 Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
	     System.out.print("Each team has "+ n +" players in " + getName());
	    }*/

	public static void main(String[] args) {
		
		Soccer s1 = new Soccer();
		
		 lavanya_assingnment3 s2= new  lavanya_assingnment3();
		 
		 System.out.println(s1.getName());
		 s1.getNumberOfTeamMembers();
		 
		 System.out.println(s2.getName());
		 s2.getNumberOfTeamMembers();
		 
		 
		

	}

}



