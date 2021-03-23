package lab5;

import java.util.Scanner;

class InvalidNameException extends Exception
{
	public InvalidNameException(String msg)
	{
		super(msg);
	}
	
}
class Employee
{
	 String firstName;
	 String lastName;
	
	public void Validation() throws InvalidNameException 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=scanner.nextLine();
		System.out.println("Enter Last Name");
		String lastName=scanner.nextLine();
		if(firstName.length()<1 || lastName.length()<1)
			throw new InvalidNameException("Entry Missing");
		
	}
}

public class Exercise5_2 {

	public static void main(String[] args){
		
   try {
		Employee emp=new Employee();
		emp.Validation();
		System.out.println("Your Name is :"+ emp.firstName+" "+emp.lastName);
		}
		catch(InvalidNameException e){
			System.out.println(e);
		}
}
}
