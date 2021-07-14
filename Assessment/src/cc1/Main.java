package cc1;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		
		/*Create an object for the Employee class and invoke the findIncrementPercentage method 
		to calculate the incremented percentage of the salary and then invoke 
		the calculateIncrementSalary method to calculate the incremented salary of the employee
		and return the same in the Employee class. 
		Display the incremented salary as shown in the Sample Output.*/
		
		System.out.println("Enter the Employee Id");
		int EmployeeId = Integer.parseInt(read.nextLine());
		//System.out.println(EmployeeId);
		
		
		System.out.println("Enter the Employee Name");
		String EmployeeName = read.nextLine();
		//System.out.println(EmployeeName);
		
		
		System.out.println("Enter the Salary");
		double Salary = Double.parseDouble(read.nextLine());
		//System.out.println(Salary);
		
		
		System.out.println("Enter the Number of Years in Experience");
		int NumberOfYears = Integer.parseInt(read.nextLine());
		//System.out.println(NumberOfYears);
		
		Employee NewEmp = new Employee(EmployeeId,EmployeeName,Salary);
		NewEmp.findIncrementPercentage(NumberOfYears);
		double incrementedSalary = NewEmp.calculateIncrementSalary();
		System.out.printf("Incremented Salary %.2f",incrementedSalary);


	}

}
