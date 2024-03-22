package demo;

public class Employee {
	
	    
	      public  Employee()
	       {
	    	  System.out.println("hii"); 
	       }
	        public Employee(String name,int age)
	       {
	     	  System.out.println(name+" " +age); 

	       }
	       public Employee(int salary,String name)
	       {
	      	  System.out.println(salary+" "+name); 
	   
	       }
	        public Employee(String name,int salary,int age,String manager,String depart)
	       {
	       	  System.out.println(name+" "+salary+" "+age+" "+manager+" "+depart); 

	       }

		public static void main (String[] args) 
			{
			     Employee e1 = new Employee();
			     Employee e2 = new Employee("lavanya",22);
	             Employee e3 = new Employee(22000,"lavanya");
			     Employee e4 = new Employee("lavanya",22000,22,"reshmika","IT");
		      	 // System.out.println(e1); 
		      	  //System.out.println(e2); 
		      	  //System.out.println("prints salary"); 
		      	  //System.out.println("prints salary"); 


	         }
	}

		
