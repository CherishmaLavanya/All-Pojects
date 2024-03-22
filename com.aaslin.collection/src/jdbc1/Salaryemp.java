package jdbc1;
import java.util.List;
import java.util.ArrayList;
public class Salaryemp {


		    private int id;
		    private String name;
		
		    private static List<Salary> salaries;

		    public Salaryemp(int id, String name) {
		        this.id = id;
		        this.name = name;
		        this.salaries= new ArrayList<>();
		    }

		    public static void addSalary(Salary salary) {
		        salaries.add(salary);
		    }

		    @Override
		    public String toString() {
		        return "Employee{" +"id=" + id +", name='" + name + '\'' +", salaries=" + salaries + '}';
		    }
		}

