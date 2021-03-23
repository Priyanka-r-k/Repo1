package lab5;

import java.util.Scanner;

class AgeException extends Exception{
	int age;
	AgeException(int age){
		this.age=age;}
	public String toString() {
		return age+" is an Invalid Age";
	}
}

class Person{
	int age;
	void validateAge() throws AgeException
	{
		System.out.println("Enter your age");
		Scanner scanner =new Scanner(System.in);
		age=scanner.nextInt();
		if(age<16)
			throw new AgeException(age);
	}
}

public class Exercise5_1 {

	public static void main(String[] args) {
	
		try {
			Person person=new Person();
			person.validateAge();
			System.out.println("Your Age is Valid");
			}
		catch(AgeException e) {
			System.out.println(e);
		}

	}

}
