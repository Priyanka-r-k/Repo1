package lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;


public class Exercise5_3 {
	
	static void validateSalary(int salary) throws EmployeeException
	{
		if(salary<3000)
			throw new EmployeeException("Enter valid salary");
	}

		public static void main(String[] args) {
			
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter Salary of Employee");
			int salary=scanner.nextInt();
			try {
				validateSalary(salary);
				System.out.println("Valid Salary");
			}
			catch(EmployeeException e)
			{
				System.out.println(e);
			}
			
			
		}
			
}
	