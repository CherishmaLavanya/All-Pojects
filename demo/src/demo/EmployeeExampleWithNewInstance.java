package demo;
public class EmployeeExampleWithNewInstance {

        String name = "lavanya"; 
		int age = 19;
		int salary = 20000;
		String manager = "reshmika";
		String depart = "IT";
		
	    public  EmployeeExampleWithNewInstance ()
	       {
	    	  System.out.println("hii"); 
	       }
	        public EmployeeExampleWithNewInstance (String name,int age)
	       {

	       }
	       public EmployeeExampleWithNewInstance (int salary,String name)
	       {
	   
	       }
	        public EmployeeExampleWithNewInstance(String name,int salary,int age,String manager,String depart)
	       {

	       }
		public static void main(String[] args) 
		{ 
		 try { 
          Class cls = Class.forName("demo.EmployeeExampleWithNewInstance"); 
          EmployeeExampleWithNewInstance obj =(EmployeeExampleWithNewInstance)cls.newInstance(); 
     	  System.out.println(obj.name+" " +obj.age); 
     	  System.out.println(obj.salary+" "+obj.name);
     	  
       	  System.out.println(obj.name+" "+obj.salary+" "+obj.age+" "+obj.manager+" "+obj.depart); 


			} 

			catch (Exception e) 
			{ 
              e.printStackTrace(); 
			} 
			 
		} 
	}



