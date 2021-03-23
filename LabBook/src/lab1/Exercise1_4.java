package lab1;
import java.util.Scanner;

public class Exercise1_4 {
	static boolean Prime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter an Integer N");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		for(int i=2;i<=n;i++) {
			if(Prime(i))
				System.out.print(i+ " ");
		}

	}

}
