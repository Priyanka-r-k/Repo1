package lab1;

import java.util.Scanner;

public class Exercise1_1 {
	void SumOfCubes(int x) {
		int a=x;
		int sum=0;
		while(a!=0) {
			int m=a%10;
			sum=sum+(m*m*m);
			a=a/10;
		}
		System.out.println("Sum Of Cubes of digits = " +sum);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a N digit number");
		int n=scanner.nextInt();
		scanner.close();
		Exercise1_1 e1=new Exercise1_1();
		e1.SumOfCubes(n);
	}
}
