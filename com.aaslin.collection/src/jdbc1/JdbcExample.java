package jdbc1;
import java.sql.*;
import java.util.*;
public class JdbcExample {
	static Connection con = null;
	static Statement st=null;
	static ResultSet rs = null;

	static Employee e;
	static Department d;
	
	static List<Employee> emp() {
		List<Employee> data = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt", "root", "root");
			System.out.println("JDBC connection success");
			st =(Statement) con.createStatement();
			
			 rs = ((java.sql.Statement) st).executeQuery(
					"select id,name,depid,depname from employee1 e inner join department1 d where e.depid=d.depid");
		
			while (rs.next()) {
				e = new Employee();
       			d = new Department();
				e.setid(rs.getInt(1));
				e.setname(rs.getString(2));
				d.setdepid(rs.getInt(3));
				d.setdepname(rs.getString(4));
				e.setdept(d);
				data.add(e);
				e = null;
				d = null;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (Exception e) 
		{
			System.out.println( e.getMessage());
			e.printStackTrace();
		}
		return data;
	}

	public static void main(String[] args) {
		List<Employee> resultSet = emp();
		for (Employee e : resultSet) {
			System.out.println(e.toString());
		}
	
	try {
		if(con!=null)
		con.close();
		if(st!=null)
			st.close();
		if(rs!=null)
			rs.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}

	
    