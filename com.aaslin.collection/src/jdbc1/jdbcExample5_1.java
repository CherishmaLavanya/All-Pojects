package jdbc1;

import java.util.*;;

public class jdbcExample5_1 {

         public static String Email(String subscriber, String topic) {
	        StringBuilder sb = new StringBuilder();
	        
	        if(topic.equalsIgnoreCase("java"))
	        {
		     
	         sb.append("Dear ").append(subscriber).append(",\n\n\n");

	       // sb.append(topic);
	        sb.append(" Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation ");
	        sb.append("\ndependencies as possible. It is a general-purpose programming language intended to let application developers \"write");
	        sb.append("\nonce, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the ");
	        sb.append("\nneed for recompilation. ");
	        sb.append("\n\nThanks and Regards,");
	        sb.append(subscriber);
	        //return sb.toString();
	        }
	        else if(topic.equalsIgnoreCase("python"))
	        {
		         sb.append("Dear ").append(subscriber).append(",\n\n\n");

	        	sb.append(" Python is a general-purpose language, used to create a range ");
		        sb.append("\nof applications, including data science, software and web");
		        sb.append("\ndevelopment, automation, and improving the ease of everyday");
		        sb.append("\ntasks. ");
		        sb.append("\n\nThanks and Regards,");
		        sb.append(subscriber);
	        }
	           return sb.toString();

	        }
         
         
	    public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
			 System.out.print("Enter subscriber name: ");
			 String subscriber = s.nextLine();
			 
		 	  System.out.print("Enter topic ");
		      String topic = s.next();
  
		      String emailBody = Email(subscriber, topic);
		        
		        System.out.println(emailBody);
		   }
	}

