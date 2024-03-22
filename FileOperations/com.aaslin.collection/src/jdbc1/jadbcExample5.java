package jdbc1;

public class jadbcExample5 {

	public static void main(String[] args) {
		   String subscriber = "lavanya";
	        String topic = "Java";
	        
           String subscriber1 = "cherishma";
           String topic1 = "python";	        
	        
	        String emailBody = Email(subscriber, topic);
	      //  String emailBody1 = generateEmail(subscriber1, topic1);

	        
	        System.out.println(emailBody);
	        //System.out.println(emailBody1);

	    }

	    public static String Email(String subscriber, String topic) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Dear ").append(subscriber).append(",\n\n");
	        sb.append(topic);
	        
	        sb.append(" Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation ");
	        sb.append("\ndependencies as possible. It is a general-purpose programming language intended to let application developers \"write");
	        sb.append("\nonce, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the ");
	        sb.append("\nneed for recompilation. ");
	        sb.append("Thanks and Regards,");
	        sb.append("\nlavanya");
	        return sb.toString();
	    }
	
	}


