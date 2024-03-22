package jdbc1;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class JdbcExample1 {
    public static void main(String[] args) {
    	Connection con=null;
    	 ResultSet res=null;
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");  
    		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt","root","root");
    		 System.out.println("connected ");
   
    		 List<Employee> employees = new ArrayList<Employee>();
             employees.add(new Employee(4,"cherishma",12));
             employees.add(new Employee(5,"sai",6));
             employees.add(new Employee(6,"krishna",7));
             employees.add(new Employee(7,"rama",9));
             StringBuilder query = new StringBuilder();
             query.append("INSERT INTO employee1 (id,name,depid) VALUES ");
             
             for (int i = 0; i < employees.size(); i++) {
                 Employee employee = employees.get(i);
                 query.append("(").append(employee.getid()).append(", ")
                 .append("\"").append(employee.getname()).append("\"").append(", ")
                         .append(employee.getDepid())
                         .append(")");
                 if (i != employees.size() - 1) {
                     query.append(", ");
                 }
             }
             System.out.println(query.toString());
             PreparedStatement statement = con.prepareStatement(query.toString());
             statement.execute();
             System.out.println("Employees inserted successfully.");
             
    	 }

             
    	 
    	 catch(Exception e)
    	 {
    		 System.out.println(e.getMessage());
    	 }
    	 

    }
}
