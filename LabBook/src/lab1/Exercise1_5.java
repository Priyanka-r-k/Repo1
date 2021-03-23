package lab1;
import java.util.Scanner;

public class Exercise1_5 {

	static int calculateSum(int n)
	{ int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   if((i%5)==0 || (i%3)==0)
		   {
			   sum=sum+i;
		   }
	   }
		return sum;
	}
	
	public static void main(String[] args) {
	System.out.println("Enter the value of N");
	Scanner scanner =new Scanner(System.in);
	int N=scanner.nextInt();
	scanner.close();
	int x=calculateSum(N);
	System.out.println("Sum = "+ x);

	}

}
