package lab1;

import java.util.Scanner;

public class Exercise1_7 {
	static boolean checkNumber(int n)
	{
		while(n!=0)
		{
			int a=n%10;
			n=n/10;
			int b=n%10;
			if(a>=b)
				continue;
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter the integer N");
		Scanner scanner =new Scanner(System.in);
		int x= scanner.nextInt();
		scanner.close();
		boolean Inum=checkNumber(x);
		if(Inum)
		System.out.println("Increasing Number");
		else
		System.out.println("Non Increasing Number");
	}

}
