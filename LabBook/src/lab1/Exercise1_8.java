package lab1;

import java.util.Scanner;

public class Exercise1_8 {

		static boolean checkPower(int n)
		{
			while(n!=1)
			{
				if(n%2==0) {
					n=n/2;
					continue;
				}
				else
				return false;
			}
			return true;
		}

		public static void main(String[] args) {
			System.out.println("Enter the integer N");
			Scanner scanner =new Scanner(System.in);
			int x= scanner.nextInt();
			scanner.close();
			boolean Inum=checkPower(x);
			if(Inum)
			System.out.println("Power of 2");
			else
			System.out.println("Not a Power of 2");
		}

	}
