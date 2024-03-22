package jdbc1;

import java.util.ArrayList;
	import java.util.List;
	

	public class SalaryOfEmp{
	    public static void main(String[] args) {
	        List<Salaryemp> employeeList = new ArrayList<>();

	        
	        Salaryemp employee1 = new Salaryemp(1, "lavanya");
	        employee1.addSalary(new Salary(2021,12000));
	        employee1.addSalary(new Salary(2022, 15000));
	        employee1.addSalary(new Salary(2023, 23000));
	        employeeList.add(employee1);

	       
	        Salaryemp employee2 = new Salaryemp(2, "reshmika");
	        employee2.addSalary(new Salary(2022, 10000));
	        employee2.addSalary(new Salary(2021, 14000));
	        employee2.addSalary(new Salary(2020, 20000));
	        employeeList.add(employee2);

	        
	        for (Salaryemp employee : employeeList) {
	            System.out.println(employee);
	        }
	    }
	}