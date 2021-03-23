package lab1;

import java.util.Scanner;

public class Exercise1_6 {
	
	static int CalculateDifference(int n)
	{
		int sum=0;
		int sumOfSquare=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			sumOfSquare=sumOfSquare+i*i;
		}
		int Diff=sumOfSquare-(sum*sum);
		return Diff;
	}

	public static void main(String[] args) {
		System.out.println("Enter the integer N");
		Scanner scanner =new Scanner(System.in);
		int x= scanner.nextInt();
		scanner.close();
		int DiffOfSum=CalculateDifference(x);
		System.out.println("The difference between the sum of the squares and the square of their sum =" +DiffOfSum);

	}

}
