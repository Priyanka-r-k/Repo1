package lab1;
import java.util.Scanner;

class Fibonacci
{
	void recursive(int a,int b,int c,int n)
	{
		if(n-2>0) {
		c=a+b;
		a=b;
		b=c;
		recursive(a,b,c,n-1);
		return;
	}
		System.out.println("Nth value of fibonnaci sequence using recursive method = " +c);
	}
	void nonrecursive(int a,int b,int c,int n)
	{
		for(int i=0;i<n-2;i++){
		c=a+b;
		a=b;
		b=c;
	}
		System.out.println("Nth value of fibonnaci sequence using nonrecursive method = " +c);
	}
}

public class Exercise1_3 {

	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		int a=1;
		int b=1;
		int c=0;
		System.out.println("enter N");
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		f.recursive(a,b,c,n);
		f.nonrecursive(a,b,c,n);

	}

}
